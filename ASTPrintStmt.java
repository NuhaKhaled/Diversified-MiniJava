// System.out.println( Expr );
public class ASTPrintStmt extends ASTStmt{

	ASTExpr expr;
	
	ASTPrintStmt(ASTExpr expr)
	{
		this.expr = expr;
		
		children.add(expr);
	}
	
	public String toString()
	{
		return "System.out.println( " + expr.toString() + " );";
	}
	
	public String toRuby()
	{
		return "puts " + expr.toRuby();
	}
	
	public String toJS()
	{
		return "console.log( " + expr.toString() + " );";

	}
	
	public String toPython(String indent)
	{
		return indent + "print " + expr.toString();
	}
}