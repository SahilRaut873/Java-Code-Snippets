class Core2Web{
	int noOfCourse=8;
	private String favCourse="CPP";

	void disp(){
		System.out.println(noOfCourse);
		System.out.println(favCourse);
	}
}
class Student{
	public static void main(String [] args){
		Core2Web obj=new Core2Web();
		obj.disp();
		System.out.println(obj.noOfCourse);
		System.out.println(obj.favCourse);		//private variable cannot access
	}
}