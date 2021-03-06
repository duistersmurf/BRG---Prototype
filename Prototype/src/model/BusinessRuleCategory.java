package model;

public class BusinessRuleCategory 
{
	private int ID;
	private String name;
	private String type; //Type was either a static or a dynamic type as far as I remember.
	
	public BusinessRuleCategory(int _ID, String _name)
	{
		setName(_name);
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return name ;
	}

	public String getType()
	{
		return type;
	}
	
	public void setName(String _name)
	{
		name = _name ;
	}

	public void setType(String type) 
	{
		this.type = type;
	}
}
