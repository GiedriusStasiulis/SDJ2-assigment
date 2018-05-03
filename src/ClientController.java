import java.rmi.RemoteException;

public class ClientController 
{
	private ClientView clientView;
	
	public ClientController(ClientView clientView) throws RemoteException
	{
		this.clientView = clientView;		
	}
	

}
