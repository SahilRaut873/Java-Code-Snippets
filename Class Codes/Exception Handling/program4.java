class Demo{
	void m1(){
		System.out.println("Start m1");
		System.out.println(10/0);
		System.out.println("End Main");
	}
	void m2(){
		System.out.println("Start m2");
		m1();
		System.out.println("End main");
	}
	public static void main(String [] args){
		System.out.println("Start Main");
		Demo obj = new Demo();
		obj.m2();
	}
}