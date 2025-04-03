class Demo{
	int x=10;
	Demo(){												//Demo(Demo this)
		System.out.println(this);
		System.out.println(x);
		System.out.println("In no args Constructor"); 
	}
	Demo(int x){										//Demo(Demo this,int)
		System.out.println(this);
		System.out.println(x);
		System.out.println("In Para Constructor");
	}
	public static void main(String [] args){
		Demo obj1=new Demo();							//Demo(obj1)
		Demo obj2=new Demo(10);							//Demo(obj2)
	}
}