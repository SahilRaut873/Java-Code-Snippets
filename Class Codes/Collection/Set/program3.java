import java.util.*;
class HashSetDemo{
	public static void main(String [] args){
		HashSet hs=new HashSet();
		hs.add("Gaurav");
		hs.add("Sanket");
		hs.add("Abhi");
		hs.add("Mantu");

		System.out.println(hs);			//Sequance Matter Karto
		System.out.println(hs.isEmpty());			//false

		System.out.println(hs.contains("Abhi")); //true

		System.out.println(hs.contains("abhi"));		//false

		System.out.println(hs.contains("Kunal"));		//false

		System.out.println(hs.add("Ak"));
		System.out.println(hs);

		System.out.println(hs.remove("Sanket"));
		System.out.println(hs);

		System.out.println(hs.size());

		Iterator itr=hs.iterator();
		while(itr.hasNext()){
			if(itr.next()=="Mantu"){
				System.out.println("Mantu Found");
			}
		}
	}
}