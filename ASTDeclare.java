// int Identifier;
public class ASTDeclare extends ASTStmt{

	public ASTIdentifier id;
	
	ASTDeclare(ASTIdentifier id)
	{
		this.id = id;
		
		children.add(id);
	}
	
	public String toString()
	{
		return "int " + id.toString() + ";";
	}
	
	public String toRuby()
	{
		return "";
	}
	public String toJS()
	{
		return "";
	}
	
}