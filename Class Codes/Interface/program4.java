interface Demo1{
	void fun();
}
interface Demo2{
	void fun();
}
class DemoChild implements Demo2,Demo1{
	public void fun(){
		System.out.println("In Fun Child");
	}
}
class Client{
	public static void main(String [] args){
		Demo1 obj =new DemoChild();
		obj.fun();
		Demo2 obj1 = new DemoChild();
		obj1.fun();
	}

}