import java.util.concurrent.*;
class PriorityBlockingQueueDemo{
	public static void main(String [] arsg)throws InterruptedException{
		BlockingQueue bQueue=new PriorityBlockingQueue();
		/*bQueue.put(10);
		bQueue.put(20);
		bQueue.put(30);
		bQueue.put(40);
		bQueue.put(50);
		bQueue.put(60);
		bQueue.put(70);
		bQueue.put(80);
		bQueue.put(90);
		bQueue.put(100);
		bQueue.put(110);
		bQueue.put(120);*/

		for(int i=1;i<=1000;i++){
			bQueue.put(i);
		}

		System.out.println(bQueue);
		System.out.println(bQueue.size());
	}
}