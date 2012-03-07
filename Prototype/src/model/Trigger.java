package model;

public class Trigger 
{
	private int ID;
	private String event; //Only valid states are allowed like: Before Update etc.!
	
	public Trigger(int _ID, String _event)
	{
		ID = _ID;
		setEvent(_event);
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getEvent()
	{
		return event;
	}
	
	public void setEvent(String _event)
	{
		event = _event;
	}
}