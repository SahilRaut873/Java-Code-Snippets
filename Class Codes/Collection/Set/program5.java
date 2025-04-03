//UserDefined Class
import java.util.*;
class CricPlayer{
	int jerNo=0;
	String pName=null;

	CricPlayer(int jerNo, String pName){
		this.jerNo=jerNo;
		this.pName=pName;
	}
	public String toString(){
		return ("jerNo="+ jerNo + " Name=" +pName);

	}
}
class HashSetDemo{
	public static void main(String [] args){
		LinkedHashSet ls=new LinkedHashSet();
		ls.add(new CricPlayer(18,"Virat"));
		ls.add(new CricPlayer(7,"MSD"));
		ls.add(new CricPlayer(45,"Rohit"));

		System.out.println(ls);			//address print kart

	}
}