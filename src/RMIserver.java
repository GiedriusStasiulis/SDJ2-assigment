import java.rmi.RemoteException;

public class RMIserver
{	
	public static void main(String[] args) throws RemoteException 
	{		
		ServerModelManager serverModelManager = new ServerModelManager();		
		
		Member m1= new Member("name1", "123", false);
	    Member m2= new Member("name2", "123", true);
	    Member m3= new Member("name3", "123", false);
	    Member m4= new Member("name4", "123", false);
	     
	    MemberList ml = new MemberList();
	    ml.addMemberToList(m1);
	    ml.addMemberToList(m2);
	    ml.addMemberToList(m3);
	    ml.addMemberToList(m4);
	     
	    ThreadSafeMemberList tsml = new ThreadSafeMemberList(ml);
	    
	    serverModelManager.addMembersToServer(ml);
	}
}
