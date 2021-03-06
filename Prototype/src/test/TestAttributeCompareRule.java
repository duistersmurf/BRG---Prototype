package test;

import controller.Generator;
import model.Error;
import model.*;
import model.rules.*;


//Whitebox testing of the Attribute Compare Rule (Rule nr.2 )
public class TestAttributeCompareRule 
{
	
	
	public void generate()
	{
		Error _error = new Error(1,"Value error", "Value must be 1 or higher", null);
		TableColumn _tableColumn = new TableColumn(1,"price",null);
		Table _table = new Table(1,"product",_tableColumn);
		Trigger _trigger = new Trigger(1,_table,"BEFORE UPDATE");
		BusinessRuleCategory _businessRuleCatagory = new BusinessRuleCategory(1,"");
		//AttributeRangeRule _attributeRangeRule = (AttributeRangeRule) new BusinessRuleType(1, null, _businessRuleCatagory, null);
		BusinessRuleType _attributeRangeRule = new BusinessRuleType(1, null, _businessRuleCatagory, null);
		
		//Operator _operator = new Operator(new Value(1, _table), ">",new Value(2,1) , false);
		//
		Operator _operator = new Operator(new Value(1, _table, _table.getName()), ">",new Value(2,1, "") , false);
		
		BusinessRule _businessRule = new BusinessRule(1, true, "price constraint", _error, _trigger, null, _operator , _attributeRangeRule);
		
		Generator _generator = new Generator(_businessRule);
		System.out.println(_generator.toString());
	}
	
}
