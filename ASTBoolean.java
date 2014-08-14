
public class ASTBoolean extends ASTNode{
	
	public Boolean value;
	
	ASTBoolean(Boolean value)
	{
		this.value = value;
	}
	
	public String toString()
	{ if ( value){
		return "true";}
	  else{
		return "false";
	}
	}
	
	public String toRuby()
	{ if ( value){
		return "true";}
	  else{
		return "false";
	}
	}

	public String toJS()
	{ if ( value){
		return "true";}
	  else{
		return "false";
	}
	}

}