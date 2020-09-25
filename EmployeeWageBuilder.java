public class EmployeeWageBuilder{
	// constant
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static int calcEmplWageForCompany (String company, int empRate, 
												int numOfDays, int maxHours) {
		// variables 
		int totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;
		
		while (totalEmpHrs <= maxHours && totalWorkingDays < numOfDays) {
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
			int empWage = empHours * empRate;					// wage of emp based of working hours 
			totalEmpWage += empWage;								// wages of emp added
			System.out.println("Emp wage: " + empWage);
		}
		System.out.println("Total Emp wage for company: "+ company+" " + totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		calcEmplWageForCompany("DMart", 20, 2, 10);
		

	}
}