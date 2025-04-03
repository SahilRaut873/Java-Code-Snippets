import java.util.concurrent.*;
import java.util.*;
class BlockingQueueDemo{
	public static void main(String [] args)throws InterruptedException{
		BlockingQueue bQueue=new ArrayBlockingQueue(5);
		bQueue.put("Ashish");
		bQueue.put("Kanha");
		bQueue.put("Shahsi");
		bQueue.put("Badhe");

		System.out.println(bQueue);

		bQueue.put("Rahul");		//Blocked
		System.out.println(bQueue);

		bQueue.take();
		System.out.println(bQueue);

		bQueue.offer("Sahil",5,TimeUnit.SECONDS);
		bQueue.offer("Digya",5,TimeUnit.SECONDS);
		System.out.println(bQueue);

		ArrayList al=new ArrayList();
		System.out.println("ArrayList :- "+al);
		bQueue.drainTo(al);
		System.out.println("ArrayList :- "+al);
		System.out.println(bQueue);
	}

}