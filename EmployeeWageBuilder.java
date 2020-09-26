public class EmployeeWageBuilder implements IComputeEmpWage{
	// constant
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWageBuilder() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	public void addCompanyEmpWage(String company, int empRatePerHour,
					int numofWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numofWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}

	public void computeEmpWage() {
		for (int i =0; i <numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i].company+ " total wage is: "+ companyEmpWageArray[i].totalEmpWage);
		}
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		// variables 
		int empHours = 0, totalWorkingDays = 0, totalEmpHrs = 0;
		
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numofWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;      // randomly a number selected 
		
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
			// int empWage = empHours * empRatePerHour;					// wage of emp based of working hours 
			// totalEmpWage += empWage;								// wages of emp added
			System.out.println("Day-"+ totalWorkingDays +" Emp hours: " + empHours);
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