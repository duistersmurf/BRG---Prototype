package model;

import java.util.ArrayList;

public class Operator 
{
	private boolean sameRow;
	
	ArrayList<String> operatorList = new ArrayList<String>();
	
	private String equalsOperator = "=";
	private String notEqualsOperator = "!=";
	private String greaterThanOperator = ">";
	private String lesserThanOperator = "<";
	private String greaterThanOrEqualsOperator = "=>";
	private String lesserThanOrEqualsOperator = "=>";
	
	public Operator(String _operator, boolean _sameRow)
	{
		if
		(
			  !_operator.equals(equalsOperator)
			||!_operator.equals(notEqualsOperator)
			||!_operator.equals(greaterThanOperator)
			||!_operator.equals(lesserThanOperator)
			||!_operator.equals(greaterThanOrEqualsOperator)
			||!_operator.equals(lesserThanOrEqualsOperator)
		)
		{
			//TODO throw Invalid Operator Exception
		}
		setSameRow(_sameRow);
	}

	public void setSameRow(boolean _sameRow) 
	{
		_sameRow = sameRow;
	}

	public boolean isSameRow() 
	{
		return sameRow;
	}
}