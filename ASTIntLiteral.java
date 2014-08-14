
public class ASTIntLiteral extends ASTNode{
	
	public int value;
	
	ASTIntLiteral(int value)
	{
		this.value = value;
	}
	
	public String toString()
	{
		return Integer.toString(value);
	}
	
	public String toRuby()
	{
		return Integer.toString(value);
	}
	
	public String toJS()
	{
		return Integer.toString(value);
	}

}