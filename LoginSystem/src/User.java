
public class User 
{
	private String userName;
	private String password;
	
	private String sourceDatabaseUsername;
	private String targetDatabaseUsername;
	private String sourceDatabasePassword;
	private String targetDatabasePassword;
	private String sourceDatabaseURL;
	private String targetDatabaseURL;	
	
	public User(String un, String up, String su, String tu, String sp, String tp, String surl, String turl)
	{
		userName = un;
		password = up;
		sourceDatabaseUsername = su;
		targetDatabaseUsername = tu;
		sourceDatabasePassword = sp;
		targetDatabasePassword = tp;
		sourceDatabaseURL = surl;		
		targetDatabaseURL = turl;
	}
	
	public String getUsername()
	{
		return userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getSourceDatabaseUsername()
	{
		return sourceDatabaseUsername;
	}
	
	public String getSourceDatabasePassword()
	{
		return sourceDatabasePassword;
	}
	
	public String getTargetDatabaseUsername()
	{
		return targetDatabaseUsername;
	}
	
	public String getTargetDatabasePassword()
	{
		return targetDatabasePassword;
	}
	
	
	public String getSourceDatabaseURL()
	{
		return sourceDatabaseURL;
	}
	
	public String getTargetDatabaseURL()
	{
		return targetDatabaseURL;
	}
}
