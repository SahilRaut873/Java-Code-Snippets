//Yeild Method
class MyThread extends Thread{
	public void run(){
		System.out.println("Thread-0 : "+Thread.currentThread().getName());
		Thread t=Thread.currentThread();
		System.out.println(t.getPriority());
		t.setPriority(10);
		System.out.println(t.getPriority());
	}
}
class ThreadYieldDemo{
	public static void main(String [] args)throws InterruptedException{
		MyThread obj=new MyThread();
		obj.start();
		Thread.sleep(2000);
		Thread f=Thread.currentThread();
		System.out.println(f.getPriority());
		f.setPriority(1);
		System.out.println(f.getPriority());
		obj.yield();
		System.out.println("Main : "+Thread.currentThread().getName());
	}
}