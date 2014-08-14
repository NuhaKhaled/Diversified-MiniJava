import java.util.ArrayList;


public class Parser {

	 int ArrayIndex ;
	 ArrayList<Token> list;
	
	 Parser(ArrayList<Token> list){
		 this.list = list;
		 ArrayIndex = 0;
	 }
	 
	void AddtoArray(){
		if (++ArrayIndex >= list.size()){
			System.out.println("Error ! ..lesa el program mafrod my5lsesh :(");
		}
	}
ASTMainClass Goal(){
			 ASTIdentifier classId = null;
			 ASTIdentifier id = null;
			 ASTStmtList stmtList = null;
		 if(list.get(ArrayIndex).type == 19){//class
			 AddtoArray();			
			 if(list.get(ArrayIndex).type == 1){//id
				  classId= new ASTIdentifier(list.get(ArrayIndex).id);
				  AddtoArray();

				 if(list.get(ArrayIndex).type == 3){//{
					 			 AddtoArray();
		
					 if(list.get(ArrayIndex).type == 21){//public
						  AddtoArray();
						 if(list.get(ArrayIndex).type == 22){//static
							  AddtoArray();
							 if(list.get(ArrayIndex).type == 23){//void
								  AddtoArray();
								 if(list.get(ArrayIndex).type == 32){//main
									  AddtoArray();
									 if(list.get(ArrayIndex).type == 7){//(
										  AddtoArray();
										 if(list.get(ArrayIndex).type == 26){//String
											  AddtoArray();
											 if(list.get(ArrayIndex).type == 5){//[
												  AddtoArray();
									
												 if(list.get(ArrayIndex).type == 6){//]
													  AddtoArray();
													 if(list.get(ArrayIndex).type == 1){//id
														  id= new ASTIdentifier(list.get(ArrayIndex).id);
														  AddtoArray();

														 if(list.get(ArrayIndex).type == 8){//)
															  AddtoArray();
															 if(list.get(ArrayIndex).type == 3){//{
																  AddtoArray();
																  stmtList= StatementList();
																	 if(list.get(ArrayIndex).type == 4){//}
																		  AddtoArray();
																		 if(list.get(ArrayIndex).type == 4){//}
																			  AddtoArray();
																
																		 
																		 }else{
																			 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
																			 System.exit(0);

																		 }																 
																 }else{
																	 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
																	 System.exit(0);

																 }
													
															 
															 }else{
																 System.out.println("Main- Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
																 System.exit(0);

															 }
												
														 
														 }else{
															 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
															 System.exit(0);

														 }
													 
													 }else{
														 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
														 System.exit(0);

													 }
												 
												 }else{
													 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
													 System.exit(0);

												 }
											 }else{
												 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
												 System.exit(0);

											 }
										 
										 }else{
											 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
											 System.exit(0);

										 }
									 
									 }else{
										 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
										 System.exit(0);

									 }
								 
								 }else{
									 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
									 System.exit(0);

								 }
							 
							 }else{
								 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
								 System.exit(0);

							 }
						 
						 }else{
							 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
							 System.exit(0);

						 }
					 
					 }else{
						 System.out.println("Main -Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
						 System.exit(0);

					 }
				 }else{
					 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
					 System.exit(0);

				 }
			 
			 }else{
				 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
				 System.exit(0);

			 }
	}else{
		 System.out.println("Main - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
		 System.exit(0);

	}
		 
	 ASTMainClass mainclass = new ASTMainClass(classId , id , stmtList);
	 if(ArrayIndex+1 < list.size()){
		 System.out.println("Code should have ended :( ");
		 System.exit(0);

	 }else{
		 System.out.println("Parsing Was done successfully");

	 }
	 return mainclass;
	 
	 }

	 
	 ASTDeclare DeclareStatement(){
		 ASTIdentifier id = null;
		 if(list.get(ArrayIndex).type == 27){//int
			  AddtoArray();

		 } else{
			 System.out.println("Declare - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		  if(list.get(ArrayIndex).type == 1){//ID
			  id= new ASTIdentifier(list.get(ArrayIndex).id);
			  AddtoArray();

		 } else{
			 System.out.println("Declare - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		  
		  if(list.get(ArrayIndex).type == 10){//;
			  AddtoArray();
		 }else{
			 System.out.println("Declare - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);
		 }
		  ASTDeclare x = new ASTDeclare(id);
		  return x;
	 }

	 //done
	 ASTBlock Block(){
		 if(list.get(ArrayIndex).type == 3){//{
			  AddtoArray();
		 }else{
			 System.out.println("Block - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		ASTStmtList x =  StatementList();
		 if(list.get(ArrayIndex).type == 4){//}
			  AddtoArray();
		 }else{
			 System.out.println("Block -Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		 ASTBlock block= new ASTBlock(x);
		 return block;
	 }

	 ASTStmtList StatementList(){
		 //to be done lesa
		 ASTStmtList stmtlist = new ASTStmtList();

		 while(list.get(ArrayIndex).type == 27  || list.get(ArrayIndex).type == 1 || list.get(ArrayIndex).type == 33 ||list.get(ArrayIndex).type == 36 ||list.get(ArrayIndex).type == 3){
			 stmtlist.addStmt(Statement());

		 }

		return stmtlist;
	 }
	 
	 ASTStmt Statement(){
		 ASTStmt x = null;
		 if(list.get(ArrayIndex).type == 27){//int
			  x = DeclareStatement();
		 } else if(list.get(ArrayIndex).type == 1){//id
			 x =  AssignmentStatement();
		 }else if (list.get(ArrayIndex).type == 33){//if
			  x = IfStatement();
		  } else if(list.get(ArrayIndex).type == 36){//print
			   x =  PrintStatement();
			  
		  }else if(list.get(ArrayIndex).type == 3){//{
			   x = 	 Block();
			 }else{
				 System.out.println(" Statement Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
				 System.exit(0);

			 }
		 
		 //lesa need to handle this !
         	return x;
		 
	 }
	 
	 ASTAssignStmt AssignmentStatement(){
		 ASTIdentifier id = null;
		 if(list.get(ArrayIndex).type == 1){//id
			  id= new ASTIdentifier(list.get(ArrayIndex).id);
			  AddtoArray();

		 }else{
			 System.out.println("Assig - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);
}
		 
		 if(list.get(ArrayIndex).type == 11){//=
			  AddtoArray();
		 }else{
			 System.out.println("Assig - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		 
		 ASTExpr expression = Expr();
		 if(list.get(ArrayIndex).type == 10){//;
			  AddtoArray();
		 }else{
			 System.out.println("Assig - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		 ASTAssignStmt assignStmt = new ASTAssignStmt(id,expression);
		 return assignStmt;
	 }
	 
ASTIfStmt IfStatement(){
		 if(list.get(ArrayIndex).type == 33){//if
			  AddtoArray();
		 }else{
			 System.out.println("if - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		 
		 if(list.get(ArrayIndex).type == 7 ){// (
			  AddtoArray();
		 }else{
			 System.out.println("bracket - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		 ASTExpr bracket = Expr();
		 if(list.get(ArrayIndex).type == 8 ){// )
			  AddtoArray();
		 }else{
			 System.out.println("bracket - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);
		 }
		 
		 ASTStmt stmt1 = Statement();
		 if(list.get(ArrayIndex).type == 34){//else
			  AddtoArray();
		 }else{
			 System.out.println("if - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		 ASTStmt stmt2 =  Statement();
		 ASTIfStmt Ifstmt = new ASTIfStmt(bracket,stmt1,stmt2);
		 return Ifstmt;
	 }

ASTPrintStmt PrintStatement(){
		 
		 if(list.get(ArrayIndex).type == 36){//print
			  AddtoArray();
			  
		 }else{
			 System.out.println("print - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		 
		 if(list.get(ArrayIndex).type == 7 ){// (
			  AddtoArray();
		 }else{
			 System.out.println("bracket - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		 ASTExpr bracket = Expr();
		 if(list.get(ArrayIndex).type == 8 ){// )
			  AddtoArray();
		 }else{
			 System.out.println("bracket - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);
		 }
		 
		 if(list.get(ArrayIndex).type == 10){//;
			  AddtoArray();
			  
		 }else{
			 System.out.println("print - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);
		 	}
		 ASTPrintStmt printstmt = new ASTPrintStmt(bracket);
		 return printstmt;
	 }
	 
ASTExpr Expr(){

		 ASTPrimaryExpr primary1= PrimaryExpr();

		 if(list.get(ArrayIndex).type == 13){//<
			 ASTPrimaryExpr primary2 = CompareExpr();
			 ASTCompareExpr x = new ASTCompareExpr(primary1,primary2);
			 return x;
		 }else if(list.get(ArrayIndex).type == 14){//+
			 ASTPrimaryExpr primary2 = PlusExpr();
			 ASTPlusExpr x = new ASTPlusExpr(primary1,primary2);
			 return x;
		 }else  if(list.get(ArrayIndex).type == 15){//-
			 ASTPrimaryExpr primary2 =  MinusExpr();
			 ASTMinusExpr x = new ASTMinusExpr(primary1,primary2);
			 return x;
		 }else{
				return primary1;
		 }
	 }
	 
	 ASTPrimaryExpr CompareExpr(){
	//		PrimaryExpr();
			
			 if(list.get(ArrayIndex).type == 13){//<
				  AddtoArray();
			 }else{
				 System.out.println("Compare - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
				 System.exit(0);

			 }
			 return PrimaryExpr();


		}
		
	ASTPrimaryExpr PlusExpr(){
	//		PrimaryExpr();
			
			 if(list.get(ArrayIndex).type == 14){//+
				  AddtoArray();
			 }else{
				 System.out.println(" Plus - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
				 System.exit(0);

			 }
			 return PrimaryExpr();


		}
		
	ASTPrimaryExpr MinusExpr(){
	//	PrimaryExpr();
		
		 if(list.get(ArrayIndex).type == 15){//-
			  AddtoArray();
		 }else{
			 System.out.println("Minus - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		 return PrimaryExpr();
	}
	
	ASTPrimaryExpr PrimaryExpr(){
		 ASTPrimaryExpr primary = null;
		 if(list.get(ArrayIndex).type == 2){//  int
			  ASTIntLiteral intValue = new ASTIntLiteral(list.get(ArrayIndex).intVal);
			  primary = new  ASTPrimaryExpr(intValue);
			  AddtoArray();
		 }
		 else if (list.get(ArrayIndex).type == 29){//  true
			  ASTBoolean BooleanValue = new ASTBoolean(true);
			  primary = new  ASTPrimaryExpr(BooleanValue);
			  AddtoArray();


		 }
		 else if (list.get(ArrayIndex).type == 30){//  false
			  ASTBoolean BooleanValue = new ASTBoolean(false);
			  primary = new  ASTPrimaryExpr(BooleanValue);
			  AddtoArray();

		 }
		 else if (list.get(ArrayIndex).type == 1){//  id
			  ASTIdentifier id = new ASTIdentifier(list.get(ArrayIndex).id);
			  primary = new  ASTPrimaryExpr(id);
			  AddtoArray();

			  }
		 else if (list.get(ArrayIndex).type == 7){//  (
			 ASTBracketExpr bracket = BracketExpr();
			 primary = new  ASTPrimaryExpr(bracket);
		 }else{
			 System.out.println("Primary Expr - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);
		 }
		return primary;
	 }
	
	 ASTBracketExpr BracketExpr(){ // ( Expression )

		 if(list.get(ArrayIndex).type == 7 ){// (
			  AddtoArray();
		 }else{
			 System.out.println("bracket - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);

		 }
		 ASTExpr x = Expr();
		 if(list.get(ArrayIndex).type == 8 ){// )
			  AddtoArray();
		 }else{
			 System.out.println("bracket - Error at line no : " + list.get(ArrayIndex).line_no + " & " + list.get(ArrayIndex).type);
			 System.exit(0);
		 }
		 ASTBracketExpr bracket = new ASTBracketExpr(x);
		 return bracket;
	}
	 

	
}

