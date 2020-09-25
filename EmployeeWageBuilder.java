public class EmployeeWageBuilder{
	// constant
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numofWorkingDays;
	private final int maxHoursPerMonth;

	public EmployeeWageBuilder(String company,
				int empRatePerHour, int numofWorkingDays,
				int maxHoursPerMonth) {

		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numofWorkingDays = numofWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	public int calcEmplWageForCompany () {
		// variables 
		int totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;
		
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numofWorkingDays) {
			int empHours = 0;
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
			int empWage = empHours * empRatePerHour;					// wage of emp based of working hours 
			totalEmpWage += empWage;								// wages of emp added
			System.out.println("Day-"+ totalWorkingDays +" Emp wage: " + empWage);
		}
		System.out.println("Total Emp wage for company: "+ company+" " + totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		EmployeeWageBuilder dMart = new EmployeeWageBuilder("Dmart", 20, 2, 10);
		EmployeeWageBuilder iBm = new EmployeeWageBuilder("IBM", 40, 4, 20);
		dMart.calcEmplWageForCompany();
		System.out.println(dMart);

		iBm.calcEmplWageForCompany();
		System.out.println(iBm);
	}
}