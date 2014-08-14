// Identifier = Expression;
public class ASTAssignStmt extends ASTStmt{

	public ASTIdentifier  id;
	public ASTExpr expr;
	
	ASTAssignStmt(ASTIdentifier id, ASTExpr expr)
	{
		this.id = id;
		this.expr = expr;
		
		children.add(id);
		children.add(expr);
	}
	
	public String toString()
	{
		return id.toString() + " = " + expr.toString() + ";";
	}
	
	public String toRuby(){
		return id.toRuby() + " = " + expr.toRuby() ;
	}
	
	public String toJS(){
		return id.toJS() + " = " + expr.toJS() ;
	}
	
	public String toPython(String indent)
	{
		return indent + id.toString() + " = " + expr.toString();
	}
}