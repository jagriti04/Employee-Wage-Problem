import java.util.*;
public class CompanyEmpWage {
	
	public final String company;
	public final int empRatePerHour;
	public final int numofWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;
	public ArrayList<Integer> empDailyWage = new ArrayList<Integer>();	// this arraylist will contain daily wage for a company


	public CompanyEmpWage(String company,
				int empRatePerHour, int numofWorkingDays,
				int maxHoursPerMonth) {

		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numofWorkingDays = numofWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

}