//Using Runnable
class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(1000);
		}catch(InterruptedException obj){
			System.out.println(obj.toString());
		}
	}
}
class ThreadGroupDemo{
	public static void main(String [] args)throws InterruptedException{
		ThreadGroup pThreadGP=new ThreadGroup("India");

		MyThread obj1=new MyThread();
		MyThread obj2=new MyThread();

		Thread t1=new Thread(pThreadGP,obj1,"Maha");
		Thread t2=new Thread(pThreadGP,obj2,"Goa");
		t1.start();
		t2.start();

		ThreadGroup cThreadGP=new ThreadGroup("Pkaistan");

		Thread.sleep(1100);
		MyThread obj3=new MyThread();
		MyThread obj4=new MyThread();

		Thread t3=new Thread(cThreadGP,obj3,"Lahore");
		Thread t4=new Thread(cThreadGP,obj4,"Karachi");

		t3.start();
		t4.start();
	}
}