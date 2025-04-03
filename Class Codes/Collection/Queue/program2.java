import java.util.concurrent.*;
class BlockingQueueDemo{
	public static void main(String [] args)throws InterruptedException{
		BlockingQueue bQueue=new ArrayBlockingQueue(5);
		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);
		bQueue.offer(40);

		System.out.println(bQueue);

		bQueue.put(40);		//Blocked
		System.out.println(bQueue);
	}

}