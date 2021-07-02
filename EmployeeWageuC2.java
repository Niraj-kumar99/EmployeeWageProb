
public class EmployeeWageuC2 {
	public static void main(String[] args) {
		final int wageHr = 20;
		final int workingHr = 8;
		
		int attendance = (int) (Math.random()*10) % 2;
		
		if(attendance == 1)
		{
			System.out.println("Employee Present");
			
			int wage = workingHr * wageHr ;
			System.out.println("Employee Wage is : "+wage);
		}
		else
			System.out.println("Employee is absent");
	}

}
