
public class EmployeeWageUC3 {
	public static void main(String[] args) {
		final int wageHr = 20;
		final int workingHr = 8;
		final int partWorkingHr = 4;
		
		int attendance = (int) (Math.random()*10) % 2;
		
		
		if (attendance == 1)
		{
			System.out.println("Permanent Employee");
			
			int wage = workingHr * wageHr ;
			System.out.println("Employee Wage is : "+wage);
		}
		else
		{
			System.out.println("Part Time Employee");
			
			int partWage = partWorkingHr * wageHr ;
			System.out.println("Part Time Employee Wage : "+partWage);
		}

	}

}
