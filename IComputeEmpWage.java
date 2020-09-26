public interface IComputeEmpWage{
	public void addCompanyEmpWage(String company, int empRatePerHour,
					int numofWorkingDays, int maxHoursPerMonth);
	public void computeEmpWage();
}