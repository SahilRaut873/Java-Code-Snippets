import java.io.*;
class AnagramDemo{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1st String");
		String str1=br.readLine();

		System.out.println("Enter 2nd String");
		String str2=br.readLine();

		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		int store1=0;
		int store2=0;

		if(arr1.length==arr2.length){
			for(int i=0; i<arr1.length; i++){
				//char ch=str1.charAt(i);
				//store1=(int)ch;
				store1=store1+(int)arr1[i];
			}
			for(int i=0; i<arr2.length; i++){
			//char ch = str2.charAt(i);
			//store2=(int)ch;
				store2=store2+(int)arr2[i];
		}
		if(store1==store2){
			System.out.println(str1 + " and " + str2 +" are anagram ");

		}else{
			System.out.println(str1 + " and " + str2 +" are NOT anagram ");
		}
		}else{
			System.out.println(str1 + " and " + str2 +" are anagram ");
		}
	}


}