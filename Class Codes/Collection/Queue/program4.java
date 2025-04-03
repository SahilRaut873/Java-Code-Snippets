import java.util.concurrent.*;
class PriorityBlockingQueueDemo{
	public static void main(String [] arsg)throws InterruptedException{
		BlockingQueue bQueue=new PriorityBlockingQueue();
		bQueue.put("Ashish");
		bQueue.put("Kanha");
		bQueue.put("Rahul");
		bQueue.put("Badhe");

		System.out.println(bQueue);
		System.out.println(bQueue.size());
	}
}