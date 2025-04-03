class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		/*for(int i=0; i<10; i++){
			System.out.println("In Run");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException obj){

			}
		
		finally{
			System.out.println("Code Chaltoy");

		}
		}*/
	}						//Eth try catch Use karayech because This method not the Parent Class Means Thread Class 
}
class ThreadDemo{
	public static void main(String [] args)throws Throwable{
		MyThread obj=new MyThread();
		System.out.println(Thread.currentThread().getName());
		obj.start();
		/*for(int i=0; i<10; i++){
			System.out.println("In main");
			Thread.sleep(2000);
		}*/
	}
}