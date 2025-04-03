class StringDemo{
	public static void main(String [] args){
		String str1 = "Kanha";
		String str2 = "Kanhaa";
		String str3 = new String("Kanha");
		String str4 = new String("Kanha");
		String str5 = new String("Rahul");
		String str6 = "Rahul";

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
	}
}

//String madhe " " ashi string dili tar te SCP var jati an String " " ashi but name vegl asel tar vegla gola  banto.
//new ne String Banvli tar every time new string banti.