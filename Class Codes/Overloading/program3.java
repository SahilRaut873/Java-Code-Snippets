class Demo{
	/*void fun(int x,float y){
		System.out.println("Int-Float Para");
	}*/
	void fun(int x, float y){
		System.out.println("Float-Int Para");
	}
}
class Client{
	public static void main(String [] args){
		Demo obj=new Demo();
		obj.fun(10.5,10);
	}
}