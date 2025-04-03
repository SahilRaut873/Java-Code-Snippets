class Demo extends Thread{
	public void run(){
		System.out.println("Demo :- "+Thread.currentThread().getName());
	}
}
class MyThread extends Thread{
	public void run(){
		System.out.println("MyTHread :- "+ Thread.currentThread().getName());

		Demo obj2=new Demo();
		obj2.start();
	}						//If we make new object and call the start method new thread is generated.
}
class ThreadDemo{
	public static void main(String [] args){
		System.out.println("ThreadDemo :- "+Thread.currentThread().getName());

		MyThread obj=new MyThread();
		obj.start();

		Demo obj1=new Demo();
		obj1.start();
	}
}