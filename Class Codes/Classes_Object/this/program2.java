class Demo{
	Demo(){
		System.out.println(this);
		System.out.println("Args");
	}
	Demo(int x){
		System.out.println(this);
		System.out.println("Para");
	}
	Demo(Demo xyz){
		System.out.println(this);
		System.out.println("Para Demo");
	}
	public static void main(String [] args){
		Demo obj1=new Demo();
		Demo obj2=new Demo(10);
		Demo obj3=new Demo(obj1);
	}
}