class myThread extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("In Run");
		}
	}
}
class ThreadDemo{
	public static void main(String [] args){
		myThread obj =new myThread();
		obj.start();

		for(int i=0; i<10; i++){
			System.out.println("In main");
		}
	}
}