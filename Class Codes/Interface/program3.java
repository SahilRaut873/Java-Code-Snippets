interface Demo{
	void fun();
	void gun();

}
abstract class DemoChild implements Demo{
	public void gun(){
		System.out.println("In gun");
	}
}
class DemoChild1 extends DemoChild{
	public void fun(){
		System.out.println("In Fun");
	}
}
class Client{
	public static void main(String [] args){
		DemoChild1 obj =new DemoChild1();
		obj.fun();
		obj.gun();
	}
}