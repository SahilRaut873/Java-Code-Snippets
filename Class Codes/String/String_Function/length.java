import java.io.*;
class LengthDemo{
	int myLength(String str){
		char arr[] = str.toCharArray();
		int count=0;
		for(int i=0; i<arr.length; i++){
			count++;
		}
		return count;
	}
	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1st String");
		String str1=br.readLine();

		LengthDemo obj = new LengthDemo();
		int total=obj.myLength(str1);

		System.out.println(total);
	}


}