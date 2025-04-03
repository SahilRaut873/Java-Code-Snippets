class MyThread extends Thread{
	MyThread(ThreadGroup tg, String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo{
	public static void main(String [] args){
		ThreadGroup pThreadGP=new ThreadGroup("Core2Web");

		MyThread obj1=new MyThread(pThreadGP,"C");
		MyThread obj2=new MyThread(pThreadGP,"Java");
		MyThread obj3=new MyThread(pThreadGP,"Python");

		System.out.println(pThreadGP.activeCount());

		obj1.start();
		obj2.start();
		obj3.start();

		ThreadGroup cThreadGP=new ThreadGroup("Incubator");

		//System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());


		System.out.println(cThreadGP.activeCount());

		MyThread obj4=new MyThread(cThreadGP,"Flutter");
		MyThread obj5=new MyThread(cThreadGP,"React");
		MyThread obj6=new MyThread(cThreadGP,"SpringBoot");

		obj4.start();
		obj5.start();
		obj6.start();

		//System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());


		//System.out.println(cThreadGP.activeCount());

	}
}