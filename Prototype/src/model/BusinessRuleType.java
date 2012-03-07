package model;

public class BusinessRuleType 
{
	private int ID;
	private String name;
	private String message;
	private String comment;
	
	public BusinessRuleType(int _ID, String _name)
	{
		ID = _ID;
		setName(_name);
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public String getComment()
	{
		return comment;
	}
	
	public void setName(String _name)
	{
		name = _name;
	}
	
	public void setMessage(String _message)
	{
		message = _message;
	}
	
	public void setComment(String _comment)
	{
		comment = _comment;
	}
}