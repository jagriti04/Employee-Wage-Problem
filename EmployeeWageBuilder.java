public class EmployeeWageBuilder{
	
	public static void main(String[] args) {
		System.out.print("Welcome to Employee Wage Computation Program\n");

		// constant
		int IS_FULL_TIME = 1;

		// variable
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		
		// Computation UC1 
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}
}