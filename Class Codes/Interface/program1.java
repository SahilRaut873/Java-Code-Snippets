interface Demo{
	void fun(){
		System.out.println("In Fun Demo");
	}
	void gun();
}
class DemoChild implements Demo{
	public void fun(){
		System.out.println("In Fun");
	}
	public void gun(){
		System.out.println("In Gun");
	}
}
class Client{
	public static void main(String[] args) {
	Demo obj =new DemoChild();
	obj.fun();
	obj.gun();
	}
}