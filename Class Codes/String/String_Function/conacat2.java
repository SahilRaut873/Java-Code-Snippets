import java.io.*;
class Demo{
	String myconcat(String str1 , String str2){
		return str1+str2;

	}
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1st String");
		String str1= br.readLine();

		System.out.println("Enter 2nd String");
		String str2=br.readLine();

		Demo obj = new Demo();
		String str=obj.myconcat(str1,str2);

		System.out.println(str);

	}
}