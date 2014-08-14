import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;


public class Tokenizer {
	public static ArrayList<Token> tokenizer(String filepath) throws IOException{
		FileReader fileReader = new FileReader(filepath);
		ArrayList<Token> list = new ArrayList <Token>();



		StreamTokenizer tokenizer = new StreamTokenizer(fileReader);
		  
		  //specifies that numbers should be parsed by this tokenizer.
		  tokenizer.parseNumbers();
		  
		  //wordChars(int low, int hi) API method that specifies that all characters c in the range low <= c <= high are word constituents.
		  tokenizer.wordChars('_', '_');
		  tokenizer.ordinaryChar('.');
		  tokenizer.ordinaryChar(',');

		  
		  //eolIsSignificant(boolean flag) method that determines whether or not ends of line are treated as tokens.
		  tokenizer.eolIsSignificant(true);
		  
		  //ordinaryChars(int low, int hi) that specifies that all characters c in the range low <= c <= high are “ordinary” in this tokenizer.
		  tokenizer.ordinaryChars(0, ' ');
		  
		  //slashSlashComments(boolean flag) method that determines whether or not the tokenizer recognizes C++-style comments.
		  tokenizer.slashSlashComments(true);
		  
		  
		  //slashStarComments(boolean flag) API method that determines whether or not the tokenizer recognizes C-style comments.
		  tokenizer.slashStarComments(true);


		  //get first token in file
		  int tok = tokenizer.nextToken();
		  //loop on all tokens.
		  
		  boolean first_loop = true;
				 
		  while (tok != StreamTokenizer.TT_EOF) {
			  if(first_loop == true)
				  first_loop = false;
			  else
			  tok = tokenizer.nextToken();
			  
			  switch (tok) {
			  
			      case StreamTokenizer.TT_NUMBER:
			      {
			   		    Token token = new Token(Token.Type.INTLIT.typeCode, (int)tokenizer.nval, tokenizer.lineno());
			   		    list.add(token);
			    	  	break;
			      }
			      case StreamTokenizer.TT_WORD:
			    	  	
			    	  	String word = tokenizer.sval;	    	  	 
			    	  	
			    	  	switch (word){
			    	  	 case "class":
			    	  	 {
					   		    Token token = new Token(Token.Type.CLASS.typeCode, tokenizer.lineno());
					   		    list.add(token);
					    	  	break;
					     }
			    	  	case "if":
			    	  	{
				   		    Token token = new Token(Token.Type.IF.typeCode, tokenizer.lineno());
				   		    list.add(token);
				    	  	break;
			    	  	}
			    	  	case "else":
			    	  	{
				   		    Token token = new Token(Token.Type.ELSE.typeCode, tokenizer.lineno());
				   		    list.add(token);
				    	  	break;
			    	  	}
			    	  	case "while":
			    	  	{
				   		    Token token = new Token(Token.Type.ELSE.typeCode, tokenizer.lineno());
				   		    list.add(token);
				    	  	break;
			    	  	}
			    	  	case "System":{
			    	  		
			    	  		
			    	  		StreamTokenizer tokenizerCopy = tokenizer;
	                      
			    	  		 tok = tokenizer.nextToken();
							    if ( tok == '.'){
					    	  		 tok = tokenizer.nextToken();
					    	  		 String word1 = tokenizer.sval;
					    	  		 if(word1.equals("out")){
					    	  			 tok = tokenizer.nextToken();
										    if ( tok == '.'){
							    	  			 tok = tokenizer.nextToken();

						    	  		 String word2 = tokenizer.sval; 
						    	  		 if (word2.equals("println")){
						    	  			 
						    	  			
									   		    Token token = new Token(Token.Type.PRINT.typeCode, tokenizer.lineno());
									   		    list.add(token);


						    	  			 
						    	  		 }else{
						    	  			    
								    	  		 tokenizer = tokenizerCopy;
								    	  		  Token token = new Token(Token.Type.ID.typeCode, "System",  tokenizer.lineno());
									   		    list.add(token);

						    	  		 }}else{

							    	  		 tokenizer = tokenizerCopy;
							    	  			Token token = new Token(Token.Type.ID.typeCode, "System",  tokenizer.lineno());
								   		    list.add(token);


						    	  		 }
						    	  		 }else{
							    	  		 tokenizer = tokenizerCopy;
							    	  			Token token = new Token(Token.Type.ID.typeCode, "System",  tokenizer.lineno());
								   		    list.add(token);

						    	  		 }
					    	  		 }else{

					    	  			 tokenizer.pushBack();
					    	  			Token token = new Token(Token.Type.ID.typeCode, "System",  tokenizer.lineno());
							   		    list.add(token);
					    	  			 
					    	  		 }

						break;
			    	  	}
			    	  	case "length":
			    	  	{
				   		    Token token = new Token(Token.Type.LENGTH.typeCode, tokenizer.lineno());
				   		    list.add(token);
				    	  	break;
			    	  	}
			    	  	case "true":
			    	  	{
				   		    Token token = new Token(Token.Type.TRUE.typeCode, tokenizer.lineno());
				   		    list.add(token);
				    	  	break;
			    	  	}
			    	  	case "this":
			    	  	{
				   		    Token token = new Token(Token.Type.THIS.typeCode, tokenizer.lineno());
				   		    list.add(token);
				    	  	break;
			    	  	}
			    	  	case "new":
			    	  	{
				   		    Token token = new Token(Token.Type.NEW.typeCode, tokenizer.lineno());
				   		    list.add(token);
				    	  	break;
			    	  	}
			    	  	case "false":
			    	  	{
				   		    Token token = new Token(Token.Type.FALSE.typeCode, tokenizer.lineno());
				   		    list.add(token);
				    	  	break;
			    	  	}
			    	  	 case "String":
			    	  	{
				   		    Token token = new Token(Token.Type.STRING.typeCode, tokenizer.lineno());
				   		    list.add(token);

					    	  	break;
			    	  	}
			    	  	 case "extends":
			    	  	{
				   		    Token token = new Token(Token.Type.EXTENDS.typeCode, tokenizer.lineno());
				   		    list.add(token);

					    	  	break;
			    	  	}
			    	  	 case "return":
			    	  	 { 
			    	  		
					   		    Token token = new Token(Token.Type.RETURN.typeCode, tokenizer.lineno());
					   		    list.add(token);

					    	  	break;
					    	  	}
			    	  	 case "boolean":
			    	  	{
				   		    Token token = new Token(Token.Type.BOOL.typeCode, tokenizer.lineno());
				   		    list.add(token);

					    	  	break;
			    	  	}
			    	  	 case "static":
			    	  	{
				   		    Token token = new Token(Token.Type.STATIC.typeCode, tokenizer.lineno());
				   		    list.add(token);

					    	  	break;
			    	  	}
			    	  	 case "void":
			    	  	 {
					   		    Token token = new Token(Token.Type.VOID.typeCode, tokenizer.lineno());
					   		    list.add(token);
					    	  	break;
			    	  	 }
			    	  	 case "main":
			    	  	{
				   		    Token token = new Token(Token.Type.MAIN.typeCode, tokenizer.lineno());
				   		    list.add(token);

					    	  	break;
			    	  	}
			    	  	 case "int":
			    	  	{
				   		    Token token = new Token(Token.Type.INT.typeCode, tokenizer.lineno());
				   		    list.add(token);

					    	  	break;
			    	  	}
			    		 case "public":
			    		 {
					   		    Token token = new Token(Token.Type.PUBLIC.typeCode, tokenizer.lineno());
					   		    list.add(token);

					    	  	break;
			    		 }
			    		 default:
			    		 {
					   		    Token token = new Token(Token.Type.ID.typeCode, word,tokenizer.lineno());
					   		    list.add(token);


					    	  break;
			    		 }

			    	  	}
			    	  	break;

			      case StreamTokenizer.TT_EOF:
			      {
			    	   Token token = new Token(Token.Type.EOF.typeCode, tokenizer.lineno());
			   		    list.add(token);

			    	  break;
			      }
			    	  
			      case '&':{
					    tok = tokenizer.nextToken();
					    if ( tok == '&'){
				    	   Token token = new Token(Token.Type.AND.typeCode, tokenizer.lineno());
				   		    list.add(token);

					    }
					    else
					    {
						    System.out.println("ERROR :  &");
						    tokenizer.pushBack();
					    }
					    break;
			      }
			     
			      case '=':
			      {
			    	   Token token = new Token(Token.Type.EQ.typeCode, tokenizer.lineno());
			   		    list.add(token);
					    break;  
					    
			      }
					    
					    
			      case '!':
			      {
			    	   Token token = new Token(Token.Type.NOT.typeCode, tokenizer.lineno());
			   		    list.add(token);
					    break;  

			      }
					    
			      case '<':
			      {
			    	   Token token = new Token(Token.Type.LESS.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			      
			     
			      case '+':
			      {
			    	   Token token = new Token(Token.Type.PLUS.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			      case '*':
			      {
			    	   Token token = new Token(Token.Type.MULTIP.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			      case '-':
			      {
			    	   Token token = new Token(Token.Type.MINUS.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			    
			  	 case '{':
			  	 {
			    	   Token token = new Token(Token.Type.LBRACE.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			  	 case '(':
				 {
			    	   Token token = new Token(Token.Type.LPAREN.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			    	  	
			  	 case '}':
			  	 {
			    	   Token token = new Token(Token.Type.RBRACE.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			    	  
			  	 case ')':
			  	 {
			    	   Token token = new Token(Token.Type.RPAREN.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			    	  
			    	  	
			  	 case '[':
			  	 {
			    	   Token token = new Token(Token.Type.LSQR.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			    	  
			  	 case ']':
			  	 {
			    	   Token token = new Token(Token.Type.RSQR.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			    	  
			  	
			  	 case ';':
			  	 {
			    	   Token token = new Token(Token.Type.SCOLN.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			    	  
			  	 
			  	 case ',':
			  	 {
			    	   Token token = new Token(Token.Type.COMMA.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			    	  
			  	 case '.':
			  	 {
			    	   Token token = new Token(Token.Type.DOT.typeCode, tokenizer.lineno());
			   		   list.add(token);
					   break;  

			      }
			    	  
			      default:
			    	  char character = (char) tokenizer.ttype;
			    	  if (!(character == '\t' || character == '\n' || character == ' ' || character == '\r' )){
			    		  System.out.println("ERROR " + character);
			    	  }
			    	  break;
			  }
		  }
			    fileReader.close();
			    
			 
	return list;	
		
	}
}
