
public class EmployeeWageUC1 {
	public static void main(String[] args) {
		double empCheck = Math.floor(Math.random()*10)%2 ;
		
		if (empCheck == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
