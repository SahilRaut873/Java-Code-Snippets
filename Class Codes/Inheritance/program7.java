class Parent{
	int x=10;
	static int y=20;

	static{
		System.out.println("Parent Static Block");
	}
	Parent(){
		System.out.println("In Parent Constructor");
	}
	void method(){
		System.out.println(x);
		System.out.println(y);
	}
	void method2(){
		System.out.println(x);
	}
}
class Child extends Parent{
	static {
		System.out.println("Child Static Block");
	}
	Child(){
		System.out.println("In Child Constructor");
	}
}
class Client{
	public static void main(String [] args){
		Child obj=new Child();
		obj.method();
		obj.method2();
	}
}