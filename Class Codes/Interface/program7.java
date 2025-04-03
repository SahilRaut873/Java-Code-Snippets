interface Demo{
	void gun();
	default void fun(){
		System.out.println("In Fun Demo");
	}
}
class DemoChild implements Demo{
	public void gun(){
		System.out.println("In Gun-Demochild");
	}
	public void fun(){										//Default Override karta yet
		System.out.println("In Fun Demo 2");	
	}
}
class Client{
	public static void main(String [] args){
		Demo obj=new DemoChild();
		obj.gun();
		obj.fun();
	}
}