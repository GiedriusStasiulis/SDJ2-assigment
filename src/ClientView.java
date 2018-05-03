import java.awt.event.KeyEvent;
import java.rmi.RemoteException;
import java.util.InputMismatchException;
import java.util.Observable;
import java.util.Scanner;

public class ClientView extends Observable
{
	public ClientView() throws RemoteException
	{
		ClientController clientController = new ClientController();
		MemberList membList = new MemberList();
		
		System.out.println("Welcome to VIA system!");
		System.out.println("Press 1 to list non-paid members");
		System.out.println("Press 2 to quit");
		System.out.println("------------------------------------");
	
		
		/*try
			{
				String i = input.nextLine();
								
				if (i.equals("1"))
				{
					
					System.out.println("Notified 1");
				}
				
				else if(i.equalsIgnoreCase("2"))
				{
					clientController.exit();
				}				
			}		
		
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input");
			}	
		*/
		
	}
	
	public void getInput()
	{
		
		
		Scanner input = new Scanner(System.in);
		
		int j = input.nextInt();
		
		if (j == 1)
		{
			setChanged();
			notifyObservers(1);
		}
		
		input.close();
	}
}
