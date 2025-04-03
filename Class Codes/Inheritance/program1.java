class ICCI{
	ICCI(){
		System.out.println("In ICC Constructor");
	}
}
class BCCI extends ICCI{
	BCCI(){
		System.out.println("In BCCI Constructor");
	}
}
class Client{
	public static void main(String [] args){
		BCCI jayshah=new BCCI();
	}
}