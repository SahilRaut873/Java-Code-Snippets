import java.util.*;
class IPL{
	void matchInfo(String team1,String team2){
		System.out.println(team1 +"vs"+team2);
	}
	void matchInfo(String team1,String team2,String venue){
		System.out.println(team1 +"vs" +team2);
		System.out.println("Venue = "+venue);
	}
	public static void main(String [] args){
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Team");
		String team1=sc.next();

		System.out.println("Enter Second Team");
		String team2=sc.next();
		System.out.println("Enter Match Venue");
		String venue=sc.next();
		IPL ipl2023 = new IPL();
		ipl2023.matchInfo(team1,team2);
		ipl2023.matchInfo(team1,team2,venue);*/
		IPL ipl2023 = new IPL();
		ipl2023.matchInfo("GT","CSK");
		ipl2023.matchInfo("GT","CSK","Narendra Modi Stadium");
	}
}
