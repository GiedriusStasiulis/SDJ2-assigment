import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable
{
	private String name;
	private String phoneNo;
	private Boolean paidStatus;
	
	public Member (String name, String phoneNo, Boolean paidStatus)
	{
		this.name = name;
		this.phoneNo = phoneNo;
		this.paidStatus = paidStatus;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getPhoneNo()
	{
		return this.phoneNo;
	}
	
	public Boolean membStatus()
	{
		return this.paidStatus;
	}
	
	public String toString()
	{
		String s = String.format("%s, %s, %s", name, phoneNo, paidStatus);
		
		return s;
	}
}