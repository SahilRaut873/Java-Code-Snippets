class MyThread extends Thread{
	public void run(){
		//System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
			System.out.println(Thread.currentThread());
		}catch(InterruptedException obj){
			//System.out.println(Thread.currentThread());
			//System.out.println("Exception Handle");
		}
	}

}
class ThreadDemo{
	public static void main(String [] args)throws InterruptedException{
		System.out.println(Thread.currentThread());
		MyThread obj=new MyThread();
		obj.start();

		Thread.sleep(5000);
		Thread.currentThread().setName("Core2web"); //We Change The Thread Name By Using setName() method
		System.out.println(Thread.currentThread());
	}
}