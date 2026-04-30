package java_practice;

public class reverse_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123;
		
		int reminder = 0;
		int reverse =0;
		while (num !=0)
		{
			reminder = num%10;
			reverse = reverse*10+ reminder;
			num = num/10;
			
		}
		
		System.out.print(reverse);
		
	}

}
