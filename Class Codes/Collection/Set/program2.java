import java.util.*;
class HashSetDemo{
	public static void main(String [] args){
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(15.3);
		System.out.println(hs.add("Sahil"));		//true
		System.out.println(hs.add("Sahil"));		//Duplicate data mule false yet

		System.out.println(hs);  		//Ani Eth Yek ch sahil ghet

	}
}
