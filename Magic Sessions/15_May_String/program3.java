import java.io.*;
class Demo{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1st String");
		String str1=br.readLine();

		System.out.println("Enter 2nd String");
		String str2=br.readLine();

		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		char temp=0;
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr1.length; j++){
				if(arr1[i]>arr1[j]){
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		char temp2=0;
		for(int i=0; i<arr2.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr2[i]>arr2[j]){
					temp2=arr1[i];
					arr2[i]=arr2[j];
					arr2[j]=temp2;
				}
			}
		}
		String str3 =new String(arr1);
		String str4=new String(arr2);

		if(str3.equals(str4)){
			System.out.println("Anagaram");
		}else{
			System.out.println("Not anagaram");
		}
	}
}