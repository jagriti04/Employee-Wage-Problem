import java.util.*;

public class EmployeeWageBuilder implements IComputeEmpWage{
	// constant
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private ArrayList<CompanyEmpWage> companyEmpWageArraylist;

	public EmployeeWageBuilder() {
		companyEmpWageArraylist = new ArrayList<CompanyEmpWage>();

	}

	public void addCompanyEmpWage(String company, int empRatePerHour,
					int numofWorkingDays, int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numofWorkingDays, maxHoursPerMonth);
		companyEmpWageArraylist.add(companyEmpWage);
	}

	public void computeEmpWage() {
		for (int i =0; i <companyEmpWageArraylist.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageArraylist.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println("Details for company- " +companyEmpWage.company);
			showDailyWageForCompany(companyEmpWage);
			System.out.println("Total wage is: "+ companyEmpWage.totalEmpWage);
		}
	}

	public void showDailyWageForCompany(CompanyEmpWage companyEmpWage) {
		for (int i=0; i< companyEmpWage.empDailyWage.size(); i++) {
			int day = i+1;
			System.out.println("Daily Wage for day " + day + " = " + companyEmpWage.empDailyWage.get(i));
		}
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		// variables 
		int empHours = 0, dailyWage=0, totalWorkingDays = 0, totalEmpHrs = 0;
		
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numofWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;       
		
			switch (empCheck) {									// calculates the number of working hours
				case IS_FULL_TIME:
					empHours = 8;
					break;

				case IS_PART_TIME:
					empHours = 4;
					break;

				default: 
					empHours = 0;
			}
			totalEmpHrs += empHours;	
			dailyWage = empHours * companyEmpWage.empRatePerHour;
			companyEmpWage.empDailyWage.add(dailyWage);						
		}
		
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 2,10);
		empWageBuilder.addCompanyEmpWage("IBM", 10, 4, 20);
		empWageBuilder.computeEmpWage();
	}
}