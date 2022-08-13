package javaProgram;

public class JavaPrintf {

	public static void main(String[] args) {
		// printf method ex.
		int number = 123;
		double decimalNumber = 500;
		boolean condition = false;
		char ascii = '&';
		String program = "JAVA";
		
		// conversion-character ex.
		System.out.printf("%d", number);
		System.out.println();
		System.out.printf("%f", decimalNumber);
		System.out.println();
		System.out.printf("%b", condition);
		System.out.println();
		System.out.printf("%c", ascii);
		System.out.println();
		System.out.printf("%s", program);
		System.out.println();
		
		// width ex.
		System.out.printf("%-15s programming", program);
		System.out.println();
		System.out.printf("%15s programming", program);
		System.out.println();
		
		// precision ex.
		System.out.printf("Balance: %.2f", decimalNumber);
		System.out.println();
		
		// flags
		System.out.printf("Balance: %010f", decimalNumber);
		System.out.println();
		decimalNumber = -500;
		System.out.printf("Balance: %+f", decimalNumber);
		decimalNumber = 1000000;
		System.out.println();
		System.out.printf("Balance: %,.2f", decimalNumber);
	}

}
