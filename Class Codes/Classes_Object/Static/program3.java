class Demo{
	static {
		System.out.println("Static block 1");
	}
	public static void main(String [] args){
		System.out.println("In Demo Method");
	}
}
class Client{
	static {
		System.out.println("Static block 2");
	}
	public static void main(String [] args){
		System.out.println("In client Method");
	}
	static {
		System.out.println("Static block 3");
	}
}