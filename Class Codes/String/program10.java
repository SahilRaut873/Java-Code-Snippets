class HashCodeDemo{
	public static void main(String [] args){
		String str1="Shashi";
		String str2 = new String("Shashi");
		String str3 = "Sahil";
		String str4 = new String("Shashi");
		String str5 = new String("Sahil");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());

	}
}

//HashCode jar kadhla na tar object kasa pn banvu de Hash code ha same ch aasto.
//String change zali ki hash code change hoto.
