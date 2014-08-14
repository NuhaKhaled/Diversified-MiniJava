// statement*
public class ASTStmtList extends ASTStmt{

	//ArrayList<ASTStmt> stmtList;
	
	ASTStmtList()
	{
		//stmtList = new ArrayList<ASTStmt>();
	}
	
	public void addStmt(ASTStmt stmt)
	{
		//stmtList.add(stmt);
		children.add(stmt);
	}
	
	public String toString()
	{
		if(/*stmtList.size()*/ children.size() == 0)
			return "empty statement list";
		else
		{	
			String str = "";
			for(int i=0; i</*stmtList.size()*/children.size(); i++)
			{
				str = str + /*stmtList.get(i).toString()*/ children.get(i).toString() + "\n";
			}
			return str;
		}
	}
	
	public String toRuby()
	{
		if(/*stmtList.size()*/ children.size() == 0)
			return "";
		else
		{	
			String str = "";
			for(int i=0; i</*stmtList.size()*/children.size(); i++)
			{
				str = str + /*stmtList.get(i).toString()*/ children.get(i).toRuby() + "\n";
			}
			return str;
		}
	}
	
	public String toJS()
	{
		if(/*stmtList.size()*/ children.size() == 0)
			return "";
		else
		{	
			String str = "";
			for(int i=0; i</*stmtList.size()*/children.size(); i++)
			{
				str = str + /*stmtList.get(i).toString()*/ children.get(i).toJS() + "\n";
			}
			return str;
		}
	}
	
	public String toPython(String indent)
	{
		if(/*stmtList.size()*/ children.size() == 0)
			return "";
		else
		{	
			String str = "";
			for(int i=0; i</*stmtList.size()*/children.size(); i++)
			{
				if(children.get(i).getClass().getName() == "ASTDeclare"){}
				else
				str = str + /*stmtList.get(i).toString()*/ children.get(i).toPython(indent) + "\n";
			}
			return str;
		}
	}
	
}