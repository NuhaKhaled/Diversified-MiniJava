// ( Expression )
public class ASTBracketExpr extends ASTExpr{

	public ASTExpr expr;
	
	ASTBracketExpr(ASTExpr expr)
	{
		this.expr = expr;
		
		children.add(expr);
	}
	
	public String toString()
	{
		return "( " + expr.toString() + " )";
	}
	
	public String toRuby(){
		return "( " + expr.toRuby() + " )";

	}
	

	public String toJS(){
		return "( " + expr.toJS() + " )";

	}
}