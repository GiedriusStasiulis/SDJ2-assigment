import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class MemberList implements Serializable, MemberListInterface
{
	private ArrayList<Member> memberList;
	
	public MemberList()
	{
		memberList = new ArrayList<Member>();
	}
	
	public Member getMember(int index)
	{
		return memberList.get(index);
	}
	
	public void addMemberToList(Member member)
	{
		memberList.add(member);
	}
	
	public int size()
	{
		return memberList.size();
	}
	
	public void clear()
	{
		memberList.clear();
	}
	
	public String toString()
	{
		String s = String.format("%s", memberList);
		
		return s;
	}

	@Override
	public MemberList getNonPaidMembers() throws RemoteException 
	{
		// TODO Auto-generated method stub
		return null;
	}
}