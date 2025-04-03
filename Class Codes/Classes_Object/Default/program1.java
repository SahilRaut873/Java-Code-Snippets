class Demo{
	int x=10;
	private int y=20;
	static int z=30;

	void disp(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class Client{
	public static void main(String [] args){
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		obj1.disp();

		obj1.x=40;
		obj1.z=70;
		//obj2.x=80;

		System.out.println("\n\n\n");

		obj1.disp();
		System.out.println("\n\n\n");
		obj2.disp();
	}
}