
import java.util.Scanner;

public class Flyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int dc = 0;
		int zip = 0;
		int zip1 = 60442;
		int zip2 = 60550;
		int ezip1 = 60441;
		int ezip2 = 60551;
		int nozip = 0;
		int bq = 0; // Burger question
		int ba =0; //  Burger quantity
		Scanner scan = new Scanner(System.in);
		System.out.print("Press 1 for pickup, press 2 for delivery");
		answer = scan.nextInt();
	if(answer == 1)
	{
		dc = 0;
	}
	
	if(answer == 2)
		{
		System.out.print("Please enter your zip code.");
		zip = scan.nextInt();
		if(zip>=zip1 && zip<= zip2)
			dc = 5;
			if(dc == 5)
			System.out.print("Delivery is available at a cost of $5");
		if(zip == ezip1 || zip == ezip2)
			dc = 7;
			if(dc == 7)
			System.out.print("Delivery with extra cost at $7.");
		else
			nozip = 1;
		if(nozip == 1)
			System.out.print("Delivery unavailable you will need to pick-up your order.");			
		}
	System.out.println("\nWould you like to order a Flyers' Burger for $4.50?\nPress 1 for yes, 2 for no");
	bq = scan.nextInt();
	if(bq == 1)
		System.out.println("How many would you like?");
	if(bq == 1)
		ba = scan.nextInt();
	System.out.print(ba);
	
	}

}
