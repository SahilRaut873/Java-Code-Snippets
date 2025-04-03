interface Demo{						//interface cha object nahi banvu shakat
	default void fun(){
		System.out.println("In Fun Demo");					//Default la body deta yeti
	}
}
class DemoChild implements Demo{
	public void fun(){
		System.out.println("In Fun DemoChild");
	}
}
class Client{
	public static void main(String [] args){
		DemoChild obj=new DemoChild();				//Default ovrride karta yet
		obj.fun();
		//Demo.fun();
	}
}