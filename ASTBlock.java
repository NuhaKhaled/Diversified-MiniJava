// { StatementList }
public class ASTBlock extends ASTStmt{

	public ASTStmtList stmtList;
	
	ASTBlock(ASTStmtList stmtList)
	{
		this.stmtList = stmtList;
		
		children.add(stmtList);
	}
	
	public String toString()
	{
		return "{\n\t" + stmtList.toString() + "}";
	}
	
	public String toRuby(){
		return  "\n" + stmtList.toRuby() ;
	}
	
	public String toJS(){
		return "{\n\t" + stmtList.toJS() + "}";
	}
	
	public String toPython(String indent)
	{
		return stmtList.toPython(indent);
	}
}