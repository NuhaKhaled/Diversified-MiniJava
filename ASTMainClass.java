// class Identifier { public static void main( String [] Identifier) { statementList } }
public class ASTMainClass extends ASTNode{
	
	public ASTIdentifier classId;
	public ASTIdentifier id;
	public ASTStmtList stmtList;
	
	ASTMainClass(ASTIdentifier classId, ASTIdentifier id, ASTStmtList stmtList)
	{
		this.classId = classId;
		this.id = id;
		this.stmtList = stmtList;
		
		children.add(classId);
		children.add(id);
		children.add(stmtList);
	}
	
	
	public String toString()
	{
		return "class " + classId.toString() + "{\n\t public static void main( String [] "+ id.toString() + ") { \n\t\t" + stmtList.toString() + "\n } \n}";
	}
	
	public String toRuby()
	{
		return stmtList.toRuby();
	}
	
	public String toJS()
	{
		return stmtList.toJS();
	}
	
	public String toPython(String indent)
	{
		return stmtList.toPython(indent);
	}

}