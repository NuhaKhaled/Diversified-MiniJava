// integerLiteral | Identifier | BracketExpr
public class ASTPrimaryExpr extends ASTExpr{

	final public int INTLITERAL = 0;
	final public int IDENTIFIER = 1;
	final public int BRACKETEXPR = 2;
	final public int BOOLEANEXPR = 3;
	public int type;
	
	ASTIdentifier id;
	ASTIntLiteral intLiteral;
	ASTBracketExpr bracketExpr;
	ASTBoolean booleanExpr;
	
	ASTPrimaryExpr(ASTIdentifier id)
	{
		type = IDENTIFIER;
		this.id = id;
		
		children.add(id);
	}
	
	ASTPrimaryExpr(ASTIntLiteral intLiteral)
	{
		type = INTLITERAL;
		this.intLiteral = intLiteral;
		
		children.add(intLiteral);
	}
	
	ASTPrimaryExpr(ASTBracketExpr bracketExpr)
	{
		type = BRACKETEXPR;
		this.bracketExpr = bracketExpr;
		
		children.add(bracketExpr);
	}
	
	ASTPrimaryExpr(ASTBoolean booleanExpr)
	{
		type = BOOLEANEXPR;
		this.booleanExpr = booleanExpr;
		
		children.add(booleanExpr);
	}
	
	
	public String toString()
	{
		switch(type)
		{
			case IDENTIFIER:
				return id.toString();
			case INTLITERAL:
				return intLiteral.toString();
			case BOOLEANEXPR:
				return booleanExpr.toString();
			default:
				return bracketExpr.toString();		
		}
	}
	
	public String toRuby()
	{
		switch(type)
		{
			case IDENTIFIER:
				return id.toRuby();
			case INTLITERAL:
				return intLiteral.toRuby();
			case BOOLEANEXPR:
				return booleanExpr.toRuby();
			default:
				return bracketExpr.toRuby();		
		}
	}
	
	public String toJS()
	{
		switch(type)
		{
			case IDENTIFIER:
				return id.toJS();
			case INTLITERAL:
				return intLiteral.toJS();
			case BOOLEANEXPR:
				return booleanExpr.toJS();
			default:
				return bracketExpr.toJS();		
		}
	}
}