class Player{
	private int jerNo=0;
	private String name=null;

	Player(int jerno,String name){
		this.jerNo=jerno;
		this.name=name;
		System.out.println("In Constructor");
	}
	void info(){
		System.out.println(jerNo+ "="+name);
	}
}
class client{
	public static void main(String [] args){
		Player obj1=new Player(18,"Virat");
		obj1.info();

		Player obj2=new Player(7,"MSD");
		obj2.info();

		Player obj3=new Player(45,"Rohit");
		obj3.info();
	}
}