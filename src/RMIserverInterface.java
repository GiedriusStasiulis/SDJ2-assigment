import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIserverInterface extends Remote
{
	public void addMembersToServer(MemberList memberList) throws RemoteException;
	MemberList getNonPaidMembers() throws RemoteException;
}
