//DeadLock Scenario
class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(2000);

		}catch(InterruptedException obj){

		}
		for(int i=0; i<10; i++){
			System.out.println("In Run");
		}

	}
}
class ThreadDemo{
	public static void main(String [] args)throws InterruptedException{
		MyThread obj=new MyThread();
		System.out.println(Thread.currentThread());
		obj.start();
		obj.join();
		obj.sleep(2000);
		for(int i=0; i<10; i++){
			System.out.println("In Main");
		}
		System.out.println(Thread.currentThread());
	}
}