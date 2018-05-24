
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
		int dq = 0;
		int da = 0;
		int fq = 0;
		int fa = 0;
		int fdq = 0;
		int fda = 0;
		double burger = 4.50;
		double drink = 1.50;
		double fries = 2.50;
		double dessert = 3.00;
		double cost = 0;
		final double TAX = 1.05;
		double total = 0;
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
		double bc = (ba*burger);
	
	System.out.println("\nWould you like to order a Flyers' Drink for $1.50?\nPress 1 for yes, 2 for no");
	dq = scan.nextInt();
	if(dq == 1)
		System.out.println("How many would you like?");
	if(dq == 1)
		da = scan.nextInt();
		double dcc = (da*drink);
	
	System.out.println("\nWould you like to order a Flyers' Fries for $2.50?\nPress 1 for yes, 2 for no");
	fq = scan.nextInt();
	if(fq == 1)
		System.out.println("How many would you like?");
	if(fq == 1)
		fa = scan.nextInt();
		double fc = (fa*fries);
		
	System.out.println("\nWould you like to order a Flyers' Dessert for $3.00?\nPress 1 for yes, 2 for no");
	fdq = scan.nextInt();
	if(fdq == 1)
		System.out.println("How many would you like?");
	if(fdq == 1)
		fda = scan.nextInt();
		double fdc = (fda*dessert);
	
	cost = (bc+dcc+fc+fdc);
	total = ((cost*TAX)+dc);
	System.out.print("Your order including tax will cost: "+total);
	}

}
