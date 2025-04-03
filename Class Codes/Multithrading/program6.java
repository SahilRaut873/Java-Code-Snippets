//Priority of Threads
class MyThread extends Thread{
	public void run(){
		Thread t=new Thread();
		System.out.println(t.getPriority());
	}
}
class ThreadDemo{
	public static void main(String [] args){
		Thread t=Thread.currentThread();
		System.out.println(t.getPriority());
		

		MyThread obj=new MyThread();
		obj.start();

		t.setPriority(7);

		MyThread obj2=new MyThread();
		obj2.start();
	}
}