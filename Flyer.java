
import java.util.Scanner;

public class Flyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dc; //Delivery cost
		final double TAX = .05; //tax to be charged
		String answer; //Pick-up or Delivery object

		Scanner scan = new Scanner(System.in);
		System.out.print("Pick-up or Delivery");
		answer = scan.nextLine();
		if(answer == "Pick-up")
		{
			dc = 0;
		}
		if(answer == "Delivery")
		{
			System.out.print("Please enter your zip code.");
			
			double zip = scan.nextInt();
			double zip1 = 60412;
			double zip2 = 60550;
			double ezip1 = 60441;
			double ezip2 = 60551;
			
		if(zip>= zip1 && zip <= zip2)
				dc = 5;
				System.out.print("Delivery is available at a cost of $5.");
		if (zip == ezip1 || zip == ezip2)
				dc = 7;
				System.out.print("Delivery with extra cost at $7.");
		//else
		//		System.out.print("Delivery is not available");
		}
		else
			System.out.print("Please try again.");

			
			
	}

}
