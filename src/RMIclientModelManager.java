import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Observable;
import java.util.Observer;


public class RMIclientModelManager implements Observer
{
	RMIserverInterface serverInterface;
	ClientController clientController;
	private ClientView observable ;
	
	private MemberList memberList;
	
	public RMIclientModelManager(ClientView obs) throws RemoteException
	{	
		super();  	
		
		observable = obs;
		observable.addObserver(this);
				
		this.clientController = new ClientController();		
		this.clientController.setView(observable);	
		
		try
		{
			serverInterface = (RMIserverInterface) Naming.lookup("rmi://localhost:1099/rmiServer");  
			memberList = serverInterface.getNonPaidMembers();		
			
			//System.out.println(memberList);
		}

		catch(Exception e)
		{
			e.printStackTrace();            
		}       
		clientController.getView().getInput();
	}
	 
	public MemberList getNonPaidMembers() throws RemoteException
	{
		return this.memberList;
	}

	@Override
	public void update(Observable arg0, Object arg1) 
	{		
		try 
		{
			for(int i = 0; i < getNonPaidMembers().size(); i++)
			{
				System.out.println((i + 1) + ". " + getNonPaidMembers().getMember(i));
			}		
		} 
		
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}
	}
}