import java.util.ArrayList;


public class ASTNode {

	ArrayList<ASTNode> children;
	ASTNode()
	{
		children = new ArrayList<ASTNode>();
	}
	
	public void dump(String prefix)
	{
		System.out.println(prefix + this.getClass().getName());
		for(int i=0; i<children.size(); i++)
		{
			children.get(i).dump(prefix+" ");
		}
	}
	
	public String toString(){ return "ASTNode"; }
	
	public String toRuby(){ return "leh keda"; }
	
	public String toJS(){ return "leh keda"; }
	
	public String toPython(String indent){ return ""; /*indent+"leh kedahowan ;)";*/ }

}