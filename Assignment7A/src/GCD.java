import java.math.BigInteger;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) throws gcdException 
	{
		// TODO Auto-generated method stub

		int userInput1;
		int userInput2;
		
		gcdException problem = new gcdException("GCD is equal to 1");
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter a positive integer");
		userInput1 = scan.nextInt();
		System.out.print("Please Enter a positive integer");
		userInput2 = scan.nextInt();
		BigInteger i1 = BigInteger.valueOf(userInput1);
		BigInteger i2 = BigInteger.valueOf(userInput2);
		BigInteger f1 = i1.gcd(i2);
		
		int result = f1.intValue();

		if (result == 1)
		{
			throw problem;
		}
		else
		{
		System.out.print(f1);
		}
	}

}
