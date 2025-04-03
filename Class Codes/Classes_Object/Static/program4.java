class Demo{
	static int x=10;

	static{
		int y=20;
		System.out.println(y);
	}
	static void fun(){
		int z=30;
		System.out.println(z);
	}
	static void gun(){
		int w=40;
		System.out.println(w);
	}
	public static void main(String [] args){
		System.out.println(x);
		fun();
		gun();
		System.out.println(y);
		//System.out.println(z);
	}
}