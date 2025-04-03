import java.io.*;
class Demo{
	public static void main(String [] Args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Name");
		String name = br.readLine();
		System.out.println(name);

		System.out.println("Age");
		int age = Integer.parseInt(br.readLine());
		System.out.println(age);
	}
}