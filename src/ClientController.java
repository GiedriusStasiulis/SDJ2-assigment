import java.rmi.RemoteException;

public class ClientController 
{
	private ClientView clientView;
	
	public ClientController() throws RemoteException
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
	public void exit()
	{
		System.exit(1);
	}

}
