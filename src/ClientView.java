import java.awt.event.KeyEvent;
import java.rmi.RemoteException;
import java.util.InputMismatchException;
import java.util.Observable;
import java.util.Scanner;

public class ClientView extends Observable
{
	public ClientView() throws RemoteException
	{		
		System.out.println("------ Welcome to VIA system! -=----");
		System.out.println("Press 1 to list non-paid members");
		System.out.println("Press 2 to quit");
		System.out.println("------------------------------------");
	}
	
	public void getInput()
	{	
		Scanner input = new Scanner(System.in);
		
		int j;	
		
		try
		{		
			while((j = input.nextInt()) != 2)
			{
				if(j == 1)
					{
						setChanged();
						notifyObservers(1);
					}
					
					else
					{
						System.out.println("Please enter a valid option");
					}	
				}						
			}
		
		catch (InputMismatchException e)
		{
			System.out.println("Invalid input. Shuting down...");
		}	
		
		System.out.println("System closing. Goodbye");
        System.exit(1);
		
		input.close();
	}
}
