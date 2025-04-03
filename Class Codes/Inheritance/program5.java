//STATIC IN PARENT CLASS

class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	static{
		System.out.println("In Parent Static Block");
	}
}
class Child extends Parent{
	static{
		System.out.println("In Child Static Block");
	}
}
class Client{
	public static void main(String [] args){
		Child obj=new Child();
	}
}