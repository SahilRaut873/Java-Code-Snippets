//ThreadGroup Name Using steName() mathod..
class MyThread extends Thread{
	MyThread(String str){
		super(str);
	}
	MyThread(){
		super();
	}

	public void run(){
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
class ThreadDemo{
	public static void main(String [] arfgs){
		MyThread obj=new MyThread();
		obj.start();
		//obj.getName("Sahil");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}