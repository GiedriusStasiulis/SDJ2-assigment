import java.rmi.RemoteException;

public class ClientController 
{
	private ClientView clientView;
	
	public ClientController() throws RemoteException
	{
		this.clientView = new ClientView();		
	}
	

}
