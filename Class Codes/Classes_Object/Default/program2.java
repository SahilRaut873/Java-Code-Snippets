class TodayMatch{
	String matchName="Mumbai vs Luckow";
	int matchNo=63;
	String toss="Mi won the toss & Choose  Field First";

	void lucknow(){
		int lsgRuns=177;
		int lsgWickets=3;
		String result="Luknow won by 5 runs";

		//TodayMatch obj=new TodayMatch();

		System.out.println("\t\tToday's Match is :\t\t"+/*obj.*/matchName);
		System.out.println("\t\tToday's Match No is :\t\t"+/*obj.*/matchNo);
		System.out.println("\t\tToday's Match Toss :\t\t"+/*obj.*/toss);

		System.out.print("\n\n");

		System.out.println("\t\tLuknow Runs :\t\t\t"+lsgRuns);
		System.out.println("\t\tLuknow Wickets :\t\t"+lsgWickets);
		System.out.println("\t\tToday's Match Result is :\t"+result);

		System.out.print("\n\n");

	}
	void mumbai(){
		int miRuns=172;
		int miWickets=5;
		String result="Mumabi Harli Mumbai😂🔥";

		System.out.println("\t\tMumbai Runs :\t\t\t"+miRuns);
		System.out.println("\t\tMumbai Wickets :\t\t"+miWickets);
		System.out.println("\t\tToday's Match Result is :\t"+result);
	}
	public static void main(String [] args){
		TodayMatch obj=new TodayMatch();
		obj.lucknow();
		obj.mumbai();
	}
}