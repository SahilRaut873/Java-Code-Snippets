//Default Handler Exception
class Demo{
	void m1(){
		System.out.println("In m1");
	}
	void m2(){
		System.out.println(10/0);
		System.out.println("In m2");
		m1();

	}
	public static void main(String [] args){
		Demo obj =new Demo();
		obj.m1();
	}
}
