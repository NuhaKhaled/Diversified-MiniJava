
public class ASTIdentifier extends ASTNode{
	
	public String name;
	
	ASTIdentifier(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}
	
	public String toRuby()
	{
		return name;
	}
	
	public String toJS()
	{
		return name;
	}

}