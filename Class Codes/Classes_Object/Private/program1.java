class Demo{
	int x=10;
	private int y=20;
	void fun(){
		System.out.println(x);
		System.out.println(y);
	}
}
class MainDemo{
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun();

		System.out.println(obj.x);
		System.out.println(obj.y);		//error private variable can  not access
		System.out.println(x);			//error cannot find symbol
		System.out.println(y);			//error cannot find symbol because different class
	}
}