import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MemberListInterface extends Remote
{
	public MemberList getNonPaidMembers() throws RemoteException;
}
