
import java.util.Scanner;
import java.text.NumberFormat;

public class Flyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		double deliverycost = 0;
		double zip = 0; //Customer entered zip code object
		int zip1 = 60442;
		int zip2 = 60550;
		int ezip1 = 60441; //zip code that will be charged extra
		int ezip2 = 60551; //zip code that will be charged extra
		int nozip = 0;
		double burgerquestion = 0;
		double burgerquantity = 0;
		double burgercost = 0;
		double drinkquestion = 0;
		double drinkquantity = 0;
		double drinkcost = 0;
		double fryquestion = 0;
		double fryquantity = 0;
		double frycost = 0;
		double dessertquestion = 0;
		double dessertquantity = 0;
		double dessertcost = 0;
		double burger = 4.50; //dollar amount for item
		double drink = 1.50; //dollar amount for item
		double fries = 2.50; //dollar amount for item
		double dessert = 3.00; //dollar amount for item
		double cost = 0;
		final double TAX = .05;
		double total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Press 1 for pickup, press 2 for delivery");
		answer = scan.nextInt();
		
	if(answer == 1)
	{
		deliverycost = 0;
	}	
	else
	{	
	if(answer == 2)
		{
		System.out.print("Please enter your zip code.");
		zip = scan.nextDouble();
		}
	if(zip>=zip1 && zip<= zip2)
		{
			deliverycost = 5;
			System.out.print("Delivery is available at a cost of $5");
		}
	else if(zip == ezip1 || zip == ezip2)
		{
			deliverycost = 7;
			System.out.print("Delivery with extra cost of $7.");
		}
	else
		{
			System.out.print("Delivery unavailable you will need to pick-up your order.");
		}
	}

	System.out.println("\nWould you like to order a Flyers' Burger for $4.50?\nPress 1 for yes, 2 for no");
	burgerquestion = scan.nextInt();
	if(burgerquestion == 1)
	{
		System.out.println("How many would you like?");
		burgerquantity = scan.nextInt();
		burgercost = (burgerquantity*burger);
	}
	System.out.println("\nWould you like to order a Flyers' Drink for $1.50?\nPress 1 for yes, 2 for no");
	drinkquestion = scan.nextInt();
	if(drinkquestion == 1)
	{
		System.out.println("How many would you like?");
		drinkquantity = scan.nextInt();
		drinkcost = (drinkquantity*drink);
	}
	
	System.out.println("\nWould you like to order a Flyers' Fries for $2.50?\nPress 1 for yes, 2 for no");
	fryquestion = scan.nextInt();
	if(fryquestion == 1)
	{
		System.out.println("How many would you like?");
		fryquantity = scan.nextInt();
		frycost = (fryquantity*fries);
	}
	
	System.out.println("\nWould you like to order a Flyers' Dessert for $3.00?\nPress 1 for yes, 2 for no");
	dessertquestion = scan.nextInt();
	if(dessertquestion == 1)
	{
		System.out.println("How many would you like?");
		dessertquantity = scan.nextInt();
		dessertcost = (dessertquantity*dessert);
	}
	cost = (burgercost+drinkcost+frycost+dessertcost);
	total = (((cost*TAX)+cost)+deliverycost);
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	System.out.print("Delivery fee is: "+fmt.format(deliverycost));
	System.out.print("\nYour total bill including tax and delivery fee is: "+fmt.format(total));
	}

}
