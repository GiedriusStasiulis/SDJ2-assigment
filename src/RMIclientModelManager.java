import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Observable;


public class RMIclientModelManager extends Observable
{
	RMIserverInterface serverInterface;
	ClientController clientController;
	ClientView clientView;
	private MemberList memberList;
	
	public RMIclientModelManager() throws RemoteException
	{
		super();    	

		this.clientController = new ClientController();		
		
		
		try
		{
			serverInterface = (RMIserverInterface) Naming.lookup("rmi://localhost:1099/rmiServer");  
			memberList = serverInterface.getNonPaidMembers();
			
		//System.out.println(memberList.size());
			System.out.println("Lalalalala");
		}

		catch(Exception e)
		{
			e.printStackTrace();            
		}       
		
		System.out.println(memberList);
	}
	 
	/*public MemberList getNonPaidMembers() throws RemoteException
	{
		//System.out.println(serverInterface.getNonPaidMembers());
		
		System.out.println(memberList.size());
		return this.memberList;
	}*/
}