import java.rmi.RemoteException;

public class ThreadSafeMemberList implements MemberListInterface
{

	private static MemberList memList;
	 
	public ThreadSafeMemberList(MemberList memList)
	{
	   this.memList = memList;
	}	
	
	@Override
	public synchronized MemberList getNonPaidMembers() throws RemoteException 
	{
		MemberList newList = new MemberList();
		
	     for (int i=0;i<memList.size();i++)
	     {
	        if (memList.getMember(i).membStatus()== false)
	        {
	           newList.addMemberToList(memList.getMember(i));
	        }
	     }
	     
	     return newList;
	}
}
