import java.rmi.RemoteException;

public class RMIserver
{	
	public static void main(String[] args) throws RemoteException 
	{		
		ServerModelManager serverModelManager = new ServerModelManager();		
		
		Member m1= new Member("Tom", "82563652", false);
	    Member m2= new Member("Adam", "82365415", true);
	    Member m3= new Member("Nancy", "53415265", false);
	    Member m4= new Member("Edward", "65324578", false);
	     
	    MemberList ml = new MemberList();
	    ml.addMemberToList(m1);
	    ml.addMemberToList(m2);
	    ml.addMemberToList(m3);
	    ml.addMemberToList(m4);
	     
	    ProxyMemberList tsml = new ProxyMemberList(ml);
	    
	    serverModelManager.addMembersToServer(ml);
	}
}