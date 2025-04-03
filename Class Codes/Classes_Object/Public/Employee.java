public class Employee{
	int empId=10;
	String empName="Kanha";
	int y=50;

	void empInfo(){
		System.out.println("Employee id is :- "+empId);
		System.out.println("Employee Name is :- "+empName);
		System.out.println("Y :- "+y);
	}
}
class MainDemo{
	public static void main(String [] args){
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.empInfo();							
		emp2.empInfo();


	}

}