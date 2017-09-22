package TypeCastingPKG;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		
		// Using Scanner to take dynamic/runtime values for parameters num1 and num2
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter the Byte value for B");
		byte b = input.nextByte();
				
		System.out.println("Enter the Short value for S");
		short s = input.nextShort();
		
		// Logic to add one data type variable to another type variable without type casting
		
		System.out.println("=================================================================================");
		System.out.println("Logic to add one data type variable to another type variable without type casting");
		System.out.println("=================================================================================");
		int i = b + s;
		long l = s + i;
		float f = i + l;
		double d = l + f;
		
		System.out.println("The Value of Int    I = Byte  B + Short S is  : " + i);
		System.out.println("The Value of Long   L = Short S + Int   I is  : " + l);
		System.out.println("The Value of Float  F = Int   I + Long  L is  : " + f);
		System.out.println("The Value of Double D = Long  L + Float F is  : " + d);
		
		// Logic to add one data type variable to another type variable with type casting
		
		System.out.println("=================================================================================");
		System.out.println("Logic to add one data type variable to another type variable with type casting");
		System.out.println("=================================================================================");
		
		l = (long)d + (long)f;
		i = (int)f + (int)l;
		s = (short) (l + i);
		b = (byte) (i + s);

		System.out.println("The Value of Int    L = Double D + Float F is  : " + l);
		System.out.println("The Value of Long   I = Float  F + Long  L is  : " + i);
		System.out.println("The Value of Float  S = Long   L + Int   I is  : " + s);
		System.out.println("The Value of Double B = Int    I + Short S is  : " + b);
		
		input.close();
	}
}