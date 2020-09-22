public class EmployeeWageBuilder{
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		// constant
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;

		// variables
		int empHours = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		

		// Computation UC2
		if (empCheck == IS_FULL_TIME) {
			empHours = 8;
		} else {
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