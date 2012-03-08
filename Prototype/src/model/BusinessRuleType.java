package model;

public class BusinessRuleType 
{
	private int ID;
	private String name;
	private String message;
	private String comment;
	private BusinessRuleCategory businessRuleCategory;
	private Error error;
	
	public BusinessRuleType(int _ID, String _name, BusinessRuleCategory _businessRuleCategory, Error _error)
	{
		ID = _ID;
		setName(_name);
		setBusinessRuleCategory(_businessRuleCategory);
		setError(_error);
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
	
	public Error getError()
	{
		return error;
	}
	
	public BusinessRuleCategory getBusinessRuleCategory()
	{
		return businessRuleCategory;
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
	
	private void setBusinessRuleCategory(BusinessRuleCategory _businessRuleCategory) 
	{
		businessRuleCategory = _businessRuleCategory;
	}
	
	public void setError(Error _error)
	{
		error = _error;
	}
}