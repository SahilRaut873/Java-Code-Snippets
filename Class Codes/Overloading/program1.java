class Demo{
	void fun(int x){
		System.out.println(x);
	}
	void fun(float y){
		System.out.println(y);
	}
	void fun(Demo obj){
		System.out.println("In Para Demo");
		System.out.println(obj);
	}
	public static void main(String [] args){
		Demo obj=new Demo();
		obj.fun();
		obj.fun(10.5f);
		obj.fun(obj);
	}
}
