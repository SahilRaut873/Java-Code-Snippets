//Thread Group
class MyThread extends Thread{
	MyThread(String str){
		super(str);
	}
	MyThread(){

	}
	public void run(){
		//System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadGroupDemo{
	public static void main(String [] args){
		MyThread obj=new MyThread("XYZ");
		obj.start();

		MyThread obj1=new MyThread("PQR");
		obj1.start();

		MyThread obj2=new MyThread("PQR");
		obj2.start();

		MyThread obj3=new MyThread();
		obj3.start();
	}
}