import java.rmi.RemoteException;

public class ClientController 
{
	private ClientView clientView;
	
	private static ClientController instance;
	
	private ClientController() throws RemoteException
	{
		
	}
	
	public void setView(ClientView clientView)
	{
		this.clientView=clientView;
	}
	
	public  ClientView getView()
	{
		return this.clientView;
	}
	
	public static ClientController getInstance() throws RemoteException
	{
		if (instance == null)
		{
			instance = new ClientController();
		}
		
		return instance;
	}
}
