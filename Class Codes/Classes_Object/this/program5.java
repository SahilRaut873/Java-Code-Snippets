class Demo{
	Demo(){
		this(10);
		System.out.println("In no-args Constructor");
	}
	Demo(int x){
		this();
		System.out.println("In para constructor");
	}
	public static void main(String [] rags){
		Demo obj2=new Demo(10);
	}
}

//recursive call hoto error yeti