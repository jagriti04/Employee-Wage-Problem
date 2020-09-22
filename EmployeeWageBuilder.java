public class EmployeeWageBuilder{
	// constant
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final	int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		// variables 
		int empHours = 0, empWage = 0, totalEmpWage = 0;
		
		// computation for UC5
		for (int day = 0; day < NUM_OF_WORKING_DAYS ; day++) {

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
			empWage = empHours * EMP_RATE_PER_HOUR;					// wage of emp based of working hours 
			totalEmpWage += empWage;								// wages of emp added
			System.out.println("Emp wage: " + empWage);
		}
		System.out.println("Total Emp wage:" + totalEmpWage);

	}
}