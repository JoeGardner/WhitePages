
public class Person 
{
	String adr, first, last = "";
	int phone;
	
	public Person(String adr, String first, String last)
	{
		this.adr = adr;
		this.first = first;
		this.last = last;
		phone = 0;
	}
	
	public Person(String adr, String first, String last, int phone)
	{
		this.adr = adr;
		this.first = first;
		this.last = last;
		this.phone = phone;
	}
	
	public int getPhone()
	{
		return phone;
	}
	
	public String getAdr()
	{
		return adr;
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public void setPhone(int phone)
	{
		this.phone = phone;
	}
	
	public void setAdr(String adr)
	{
		this.adr = adr;
	}
	
	public void setFirst(String first)
	{
		this.first = first;
	}
	
	public void setLast(String last)
	{
		this.last = last;
	}

}
