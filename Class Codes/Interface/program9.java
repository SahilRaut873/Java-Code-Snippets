interface Demo1{
	default void fun(){
		System.out.println("In Fun Demo1");
	}
}
interface Demo2{
	default	void fun(){
		System.out.println("In Fun Demo");
	}
}
class Demochild implements Demo1,Demo2{
	public void fun(){
		System.out.println("In Fun DemoChild");
	}
	void gun(){
		System.out.println("in gun");
	}
}
class Client{
	public static void main(String [] args){
		Demochild obj=new Demochild();
		obj.fun();

		Demo1 obj1=new Demochild();
		obj1.fun();

		Demo2 obj2=new Demochild();
		obj2.fun();

		Demochild obj3=new Demochild();
		obj3.gun();

	}
}