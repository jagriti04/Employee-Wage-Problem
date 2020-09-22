public class EmployeeWageBuilder{
	// constant
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final	int EMP_RATE_PER_HOUR = 20;


	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		// variables
		int empHours = 0;
		int empWage = 0;

		int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
		
		// Computation UC4
		switch (empCheck) {
			case IS_FULL_TIME:
				empHours = 8;
				break;

			case IS_PART_TIME:
				empHours = 4;
				break;

			default: 
				empHours = 0;
		}
		empWage = empHours * EMP_RATE_PER_HOUR;
		System.out.println("Emp wage: " + empWage);

		// Computation UC1 
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}
}