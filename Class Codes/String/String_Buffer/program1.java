class StringBufferDemo{
	public static void main(String [] args){
		StringBuffer str1 = new StringBuffer();

		System.out.println(str1.capacity());   					//16

		StringBuffer str2 = new StringBuffer("SahilMadhukarRaut");

		System.out.println(str2.capacity());					//35
	}
}