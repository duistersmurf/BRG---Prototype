package model;

public class Database 
{
	private int ID;
	private String dbType;
	private String hostName;
	private String name;
	private String password;
	private int port;
	
	public int getID()
	{
		return ID;
	}

	public String getDbType() 
	{
		return dbType;
	}

	public String getHostName() 
	{
		return hostName;
	}

	public String getName() 
	{
		return name;
	}
	
	public String getPassword() {
		return password;
	}

	public int getPort()
	{
		return port;
	}

	public void setDbType(String _dbType) 
	{
		dbType = _dbType;
	}
	
	public void setHostName(String _hostName)
	{
		hostName = _hostName;
	}

	public void setName(String _name) 
	{
		name = _name;
	}

	public void setPassword(String _password) 
	{
		password = _password;
	}

	public void setPort(int _port)
	{
		port = _port;
	}
}
