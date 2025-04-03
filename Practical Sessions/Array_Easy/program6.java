//Replace All 0's with 5
class ArrayDemo{
	static int convert0To5(int num){
		int digit=0;
		if (num == 0){
			return 5;
		}else{
			int temp = 0;
			while (num > 0){
				digit = num % 10;
				if(digit == 0){
					digit = 5;
				}
				temp = temp * 10 + digit;
				num = num / 10;
			}
		}
		return temp;
	}
}
	public static void main(String [] args){
		int num = 10120;
		int ret=(convert0To5(num));
		System.out.println(ret);
	}
}