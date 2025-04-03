import java.io.*;
class Vowels{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr Array Size");
		int size=Integer.parseInt(br.readLine());
		char arr[]=new char[size];
		//char ch;
		System.out.println("Eneter Array Element character ");
		for(int i=0; i<arr.length; i++){
			arr[i]=(char)br.read();
			br.skip(1);
		}
		//char ch;
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){

				System.out.print(" "+arr[i]);
			}
		}

	}
}