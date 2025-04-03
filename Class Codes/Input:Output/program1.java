//Using Scanner Class
import java.util.Scanner;
class DreamCompany{
	public static void main(String [] sahil){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your Dream Company");
		String name=obj.next();

		System.out.println("Enter your Salary");
		float salary=obj.nextFloat();

		System.out.println("Name of company is "+name);
		System.out.println("Pacakge is "+salary);
	}
}