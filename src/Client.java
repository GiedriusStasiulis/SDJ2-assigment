import java.rmi.RemoteException;

public class Client 
{
	public static void main(String[] args) throws RemoteException 
	{	
		ClientView clientView = new ClientView();	
		RMIclientModelManager rmiClientModelManager = new RMIclientModelManager(clientView);
	}
}
