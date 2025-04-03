class MyThread implements Runnable{
	public void run(){
		System.out.println("In Run");
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String [] args){
		MyThread obj=new MyThread();
		Thread t=new Thread(obj);
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}
//Start method is not in runnable interface therefore we requird to create thread class object and call start method.