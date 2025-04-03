class MyThread extends Thread{
	MyThread(ThreadGroup tg, String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(8000);
		}catch (InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class ThreadDemo{
	public static void main(String [] args){
		ThreadGroup pThreadGP=new ThreadGroup("India");
		MyThread t1=new MyThread(pThreadGP,"MAharashtra");
		MyThread t2=new MyThread(pThreadGP,"Goa");

		t1.start();
		t2.start();

		System.out.println(pThreadGP.activeCount());

		ThreadGroup cThreadGP1=new ThreadGroup("Pakistan");
		MyThread t3=new MyThread(cThreadGP1,"Lahore");
		MyThread t4=new MyThread(cThreadGP1,"Karachi");

		t3.start();
		t4.start();

		System.out.println(pThreadGP.activeCount());

		ThreadGroup cThreadGP2=new ThreadGroup("Bangladesh");
		MyThread t5=new MyThread(cThreadGP2,"Dhaka");
		MyThread t6=new MyThread(cThreadGP2,"Bogura");

		t5.start();
		t6.start();

		//cThreadGP1.interrupt();
		System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());
		System.out.println(cThreadGP1.activeGroupCount());
	}
}