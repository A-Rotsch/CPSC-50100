import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Elevator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String elevator;
		String floor;
		int timeout = 5;
		String destination = null;
		Scanner scan = new Scanner(System.in);
		String[] positionArray={"Basement", "First", "Second"};
		System.out.println("What floor are you on basement, first or second?");
		floor = scan.next();
	if(floor.equalsIgnoreCase(positionArray[0]))
	{
		{
		System.out.println("What floor would you like to go to?\nPlease enter basement, first  or second.");
		destination = scan.next();
		}
		if(destination.equalsIgnoreCase(positionArray[1]))
		{
			System.out.print("\nElevator doors open for 5 seconds.");
			try 
			{
				TimeUnit.SECONDS.sleep(timeout);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\nElevator doors closing");
			System.out.print("\nElevator doors closed");
			System.out.print("\nElevator moves to "+positionArray[0]);
			System.out.print("\nElevator doors open for 5 seconds.");
			try 
			{
				TimeUnit.SECONDS.sleep(timeout);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\nElevator doors closing");
			System.out.print("\nElevator doors closed");
			System.out.print("\nElevator returns to "+positionArray[0]);
		}
		else if(destination.equalsIgnoreCase(positionArray[2]))
		{
			System.out.print("\nElevator doors open for 5 seconds.");
			try 
			{
				TimeUnit.SECONDS.sleep(timeout);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\nElevator doors closing");
			System.out.print("\nElevator doors closed");
			System.out.print("\nElevator moves to "+positionArray[2]);
			System.out.print("\nElevator doors open for 5 seconds.");
			try 
			{
				TimeUnit.SECONDS.sleep(timeout);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\nElevator doors closing");
			System.out.print("\nElevator doors closed");
			System.out.print("\nElevator returns to "+positionArray[0]);
		}	
		else
		{
			System.out.print("\nSelection is not possible the application will quit");
			System.exit(5);
		}
	
	}
	else if(floor.equalsIgnoreCase(positionArray[1]))
		{
			{
			System.out.println("What floor would you like to go to?\nPlease enter basement, first  or second.");
			destination = scan.next();
			}
			if(destination.equalsIgnoreCase(positionArray[0]))
			{
				System.out.print("Elevator moves from "+positionArray[0]+" to "+positionArray[1]);
				System.out.print("\nElevator doors open for 5 seconds.");
				try 
				{
					TimeUnit.SECONDS.sleep(timeout);
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("\nElevator doors closing");
				System.out.print("\nElevator doors closed");
				System.out.print("\nElevator moves to "+positionArray[0]);
				System.out.print("\nElevator doors open for 5 seconds.");
				try 
				{
					TimeUnit.SECONDS.sleep(timeout);
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("\nElevator doors closing");
				System.out.print("\nElevator doors closed");
			}
			else if(destination.equalsIgnoreCase(positionArray[2]))
			{
				System.out.print("Elevator moves from "+positionArray[0]+" to "+positionArray[1]);
				System.out.print("\nElevator doors open for 5 seconds.");
				try 
				{
					TimeUnit.SECONDS.sleep(timeout);
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("\nElevator doors closing");
				System.out.print("\nElevator doors closed");
				System.out.print("\nElevator moves to "+positionArray[2]);
				System.out.print("\nElevator doors open for 5 seconds.");
				try 
				{
					TimeUnit.SECONDS.sleep(timeout);
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("\nElevator doors closing");
				System.out.print("\nElevator doors closed");
				System.out.print("\nElevator returns to "+positionArray[0]);
			}	
			else
			{
				System.out.print("\nSelection is not possible the application will quit");
				System.exit(5);
			}
		
		}
	else if(floor.equalsIgnoreCase(positionArray[2]))
	{
		{
		System.out.println("What floor would you like to go to?\nPlease enter basement, first  or second.");
		destination = scan.next();
		}
		if(destination.equalsIgnoreCase(positionArray[0]))
		{
			System.out.print("Elevator moves from "+positionArray[0]+" to "+positionArray[2]);
			System.out.print("\nElevator doors open for 5 seconds.");
			try 
			{
				TimeUnit.SECONDS.sleep(timeout);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\nElevator doors closing");
			System.out.print("\nElevator doors closed");
			System.out.print("\nElevator moves to "+positionArray[0]);
			System.out.print("\nElevator doors open for 5 seconds.");
			try 
			{
				TimeUnit.SECONDS.sleep(timeout);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\nElevator doors closing");
			System.out.print("\nElevator doors closed");
			System.out.print("\nElevator returns to "+positionArray[0]);
		}
		else if(destination.equalsIgnoreCase(positionArray[1]))
		{
			System.out.print("Elevator moves from "+positionArray[0]+" to "+positionArray[2]);
			System.out.print("\nElevator doors open for 5 seconds.");
			try 
			{
				TimeUnit.SECONDS.sleep(timeout);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\nElevator doors closing");
			System.out.print("\nElevator doors closed");
			System.out.print("\nElevator moves to "+positionArray[2]);
			System.out.print("\nElevator doors open for 5 seconds.");
			try 
			{
				TimeUnit.SECONDS.sleep(timeout);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\nElevator doors closing");
			System.out.print("\nElevator doors closed");
		}	
		else
		{
			System.out.print("\nSelection is not possible the application will quit");
			System.exit(5);
		}
	
	}

	else
		{
			System.out.println("Please try again using, basement, first or second.");
		}
			


	}

}
