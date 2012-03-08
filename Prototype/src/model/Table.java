package model;

public class Table 
{
	private int ID;
	private String name;
	private TableColumn tableColumn;
	
	public Table(int _ID, String _name, TableColumn _tableColumn)
	{
		ID = _ID;
		setName(_name);
		setTableColumn(_tableColumn);
	}
	
	private void setTableColumn(TableColumn _tableColumn) 
	{
		tableColumn = _tableColumn;
		
	}

	private void setName(String _name) 
	{
		name = _name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public TableColumn getTableColumn()
	{
		return tableColumn;
	}
	}
}