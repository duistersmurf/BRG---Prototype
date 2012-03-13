package controller;

import model.BusinessRule;

public class Generator
{
	private BusinessRule businessRule;
	public Generator(BusinessRule _businessRule)
	{
		businessRule = _businessRule;
	}
	
	public String toString()
	{
		String s = "CREATE ";
		if (businessRule.isReplace())
		{
			s+="OR REPLACE ";
		}
		s+="TRIGGER " + businessRule.getName();
		s+="\n" + businessRule.trigger.getEvent() + " ON "+businessRule.trigger.table.getName();
		if (businessRule.trigger.table.tableColumn!=null)
		{
			s+="." + businessRule.trigger.table.tableColumn.getName();
		}
		s+="\nBEGIN";
		s+="\nIF " + ":old.";
		
		if(businessRule.operator.getDeclaredValue().getValueString().equals(""))
		{
			s+=businessRule.operator.getDeclaredValue().getValue();
		}
		else
		{
			s+=businessRule.operator.getDeclaredValue().getValueString();
		}
		
		s+= " "+businessRule.operator.getOperator() + " ";
		
		if(businessRule.operator.getComparativeValue().getValueString().equals(""))
		{
			s+=businessRule.operator.getComparativeValue().getValue();
		}
		else
		{
			s+=businessRule.operator.getComparativeValue().getValueString();
		}
		
		s+="\nTHEN DBMS_OUTPUT.PUT_LINE('"+businessRule.error.getMessage()+"');";
		s+="\nEND IF;";
		s+="\nEND;";
		
		 
		return s;
	}
}
