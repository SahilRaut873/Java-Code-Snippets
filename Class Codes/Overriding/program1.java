class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	void Property(){
		System.out.println("Home,Car,Gold");
	}
	void marry(){
		System.out.println("Deepika Padukone");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In Child Constructor");
	}
	void marry(){
		System.out.println("Alia Bhatt");
	}
}
class Client{
	public static void main(String [] args){
		Child obj=new Child();
		obj.Property();
		obj.marry();
	}
}