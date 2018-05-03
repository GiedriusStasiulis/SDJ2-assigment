import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerModelManager extends UnicastRemoteObject implements RMIserverInterface
{
	private MemberList memberList = new MemberList();
	
	public ServerModelManager() throws RemoteException
	{		
		super();
		
		try
		{
			Registry reg = LocateRegistry.createRegistry(1099);			
			Naming.rebind("rmiServer", this);
			System.out.println("Server started!");			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	

	@Override
	public MemberList getNonPaidMembers() throws RemoteException 
	{
		System.out.println("Lala");
		
		MemberList tempList = new MemberList();
		
		for(int i = 0; i < memberList.size(); i++)
		{
			if(memberList.getMember(i).membStatus() == false)
			{			
				tempList.addMemberToList(memberList.getMember(i));
			}
		}		
		
		return tempList;
	}

	public void addMembersToServer(MemberList memberList) throws RemoteException 
	{
		this.memberList = memberList;		
	}
}