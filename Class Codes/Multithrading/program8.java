class MyThread extends Thread{
	public void run(){
		System.out.println("In Run");
	}
}
class ThreadDemo{
	public static void main(String [] args){
		MyThread obj=new MyThread();
		obj.start();
		obj.start();	//illegal start Thread Exception
	}
}