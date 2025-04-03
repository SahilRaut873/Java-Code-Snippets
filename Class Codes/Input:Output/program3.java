//String Tokenizer
import java.util.*;
import java.io.*;
class StringDemo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Eneter Society name,wing,flat_no");
		String info=br.readLine();

		System.out.println(info);

		StringTokenizer obj = new StringTokenizer(info," ");

		String token1=obj.nextToken();
		String token2=obj.nextToken();
		String token3=obj.nextToken();

		System.out.println("Society "+token1);
		System.out.println("Wing "+token2);
		System.out.println("Flat_No "+token3);	

		System.out.println(obj.countTokens());

		whhile(obj.hashMoreTokens()){
			System.out.println(obj.nextToken());
		}
		
	}
}
