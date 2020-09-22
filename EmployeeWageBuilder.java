public class EmployeeWageBuilder{
	// constant
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final	int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		// variables 
		int totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;
		
		// computation for UC6
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
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
			int empWage = empHours * EMP_RATE_PER_HOUR;					// wage of emp based of working hours 
			totalEmpWage += empWage;								// wages of emp added
			System.out.println("Emp wage: " + empWage);
		}
		System.out.println("Total Emp wage:" + totalEmpWage);

	}
}