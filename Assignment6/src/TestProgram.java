import java.util.Scanner;


public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		PaidAdvisor personA = new PaidAdvisor();
		System.out.println("Enter First Name and then Last Name");
		personA.setName(scan.next(), scan.next());
		System.out.println("Enter Regular Pay Rate, Overtime Pay Rate and Special Pay Rate");
		personA.setRateHours(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
		System.out.println("Enter Total Hours worked");
		personA.setHoursWorked(scan.nextDouble());
		System.out.println("Enter Special Hours worked");
		personA.setSpecialHours(scan.nextDouble());
		System.out.println(personA.toString1());
		
		
	}

}
