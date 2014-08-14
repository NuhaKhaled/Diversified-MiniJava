
public class Token {

	public int type;
	public int intVal;
	public String id;
	public int line_no;
	
	/* Constructors
	 **********************************************************************/
	
	Token(int type, int l_no) // For token with type and no value
	{
		this.type = type;
		line_no = l_no;
	}
	
	Token(int type, int intVal, int l_no) // For integer literal token
	{
		this.type = type;
		this.intVal = intVal;
		line_no = l_no;
	}
	
	Token(int type, String id, int l_no) // For identifier token
	{
		this.type = type;
		this.id = id;
		line_no = l_no;
	}
	
	
	
	/* Token types
	 **********************************************************************/
	public enum Type{
		EOF(0),
		ID(1), // identifier [a-zA-Z_][a-zA-Z_0-9]*
		INTLIT(2), // integer literal [0-9]+
		LBRACE(3), // {
		RBRACE(4), // }
		LSQR(5), // [
		RSQR(6), // ]
		LPAREN(7), // (
		RPAREN(8), // )
		COMMA(9), // ,
		SCOLN(10), // ;
		EQ(11), // =
		AND(12), // &&
		LESS(13), // <
		PLUS(14), // +
		MINUS(15), // -
		MULTIP(16), // *
		NOT(17), // !
		DOT(18), // .
		//KEYWORDS
		CLASS(19),
		EXTENDS(20),
		PUBLIC(21),
		STATIC(22),
		VOID(23),
		RETURN(24),
		NEW(25),
		STRING(26),
		INT(27),
		BOOL(28),
		TRUE(29),
		FALSE(30),
		THIS(31),
		MAIN(32),
		IF(33),
		ELSE(34),
		WHILE(35),
		PRINT(36), // System.out.println
		LENGTH(37);
		
		public int typeCode;
		private Type(int i)
		{
			typeCode = i;
		}// End constructor
	}// End enum Type
	
}// End Token