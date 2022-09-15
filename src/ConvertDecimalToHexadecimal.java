import java.util.Scanner;

public class ConvertDecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your number? ");
		int decimal = scan.nextInt();
		
		String hexadecimal = "";
		
		while (decimal != 0) {
		
			int hexValue = decimal % 16;
			char hexChar;
			
			if(hexValue <= 9 && hexValue >= 0) {
				hexChar = (char)(hexValue + '0');
			}
				else {
					hexChar = (char)(hexValue - 10 + 'A');
				}
			hexadecimal = hexChar + hexadecimal;
			decimal = decimal / 16;
			
			System.out.println("The hexadecimal number is: " + hexadecimal);
			}
		
	}
}

	


