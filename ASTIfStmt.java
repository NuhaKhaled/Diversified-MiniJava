//if (Expr) Stmt else Stmt
public class ASTIfStmt extends ASTStmt{

	public ASTExpr expr;
	public ASTStmt thenStmt;
	public ASTStmt elseStmt;
	
	ASTIfStmt(ASTExpr expr, ASTStmt thenStmt, ASTStmt elseStmt)
	{
		this.expr = expr;
		this.thenStmt = thenStmt;
		this.elseStmt = elseStmt;
		
		children.add(expr);
		children.add(thenStmt);
		children.add(elseStmt);
	}
	
	public String toString()
	{
		return "if ( " + expr.toString() + " )\n " + thenStmt.toString() + "\nelse \n" + elseStmt.toString();
	}
	
	public String toRuby()
	{
		return "if  " + expr.toRuby() +  thenStmt.toRuby() + "else " + elseStmt.toRuby() + "end";
	}
	
	public String toJS()
	{
		return "if ( " + expr.toJS() + " )\n " + thenStmt.toJS() + "\nelse \n" + elseStmt.toJS();
	}
	
	public String toPython(String indent)
	{
		return indent + "if " + expr.toString() + ": \n" + thenStmt.toPython(indent + "\t") + "\n" + indent + "else:\n" + elseStmt.toPython(indent + "\t");
	}
}