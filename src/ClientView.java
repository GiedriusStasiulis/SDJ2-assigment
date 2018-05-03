import java.rmi.RemoteException;
import java.util.Scanner;

public class ClientView 
{
	public ClientView() throws RemoteException
	{
		//ClientController clientController = new ClientController();
		MemberList membList = new MemberList();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to VIA system!");
		System.out.println("Press 1 to list non-paid members");
		System.out.println("Press 2 to quit");
		System.out.println("------------------------------------");
		
		int i = input.nextInt();
		
		/*if(i == 1)
		{
			membList = clientController.getNonPaidMembers();
			
			for(int j = 0; j < membList.size(); j++)
			{
				System.out.println(membList.getMember(j));
			}
		}
		
		else if (i == 2)
		{
			System.exit(1);
		}
		*/
	
	}
}
