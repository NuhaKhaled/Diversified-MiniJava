// primaryExpr - primaryExpr
public class ASTMinusExpr extends ASTExpr{
	
	ASTPrimaryExpr primaryExpr1;
	ASTPrimaryExpr primaryExpr2;
	
	ASTMinusExpr(ASTPrimaryExpr primaryExpr1, ASTPrimaryExpr primaryExpr2)
	{
		this.primaryExpr1 = primaryExpr1;
		this.primaryExpr2 = primaryExpr2;
		
		children.add(primaryExpr1);
		children.add(primaryExpr2);
	}
	
	public String toString()
	{
		return primaryExpr1.toString() + " - " + primaryExpr2.toString();
	}
	
	public String toRuby()
	{
		return primaryExpr1.toRuby() + " - " + primaryExpr2.toRuby();
	}
	
	public String toJS()
	{
		return primaryExpr1.toJS() + " - " + primaryExpr2.toJS();
	}

}