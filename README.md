Diversified-MiniJava
====================

A MiniJava to Diversified code (Ruby/Python/JS) Compiler. It was implemented for learning purpose in Compilers Course.

The projectgoal is to build a simple compiler for a simplified programming language.The main aim is to be able to define language grammar, go through lexical analysis and parsing algorithm, and apply the concept of diversity on the output .

MiniJava is a subset of Java and the meaning of a MiniJava program is given by its meaning as a Java program.

We went through 5 phases.
  ● Grammar analysis and Left recursion elimination.
  ● Tokenization.
  ● Recursive Descent Parsing Algorithm.
  ● ASTNodes Creation and Dumping.
  ● Conversion to diversified Output.
  
Programming Language Used for Development : Java
OS : tested on Linux, Windows.
  
  
MiniJava Grammar :
-------------------


MiniJava is a subset of Java and the meaning of a MiniJava program is given by its meaning as a Java program.The grammar had the formal BNF for MiniJava. It defines a set of productions starting the MainClass which describe how sequences of tokens can form syntactically correct MiniJava programs. This is an LALR(1) grammar. It was not an LL(1) grammar because it had left-recursion. First, we simplified and removed the left-recursion in the grammar.The used grammar became :

![ScreenShot](https://github.com/NuhaKhaled/Diversified-MiniJava/blob/master/images/Grammer1.png)
![ScreenShot](https://raw.githubusercontent.com/NuhaKhaled/Diversified-MiniJava/master/images/Grammer%202.png)

Compiler Design and Implementation :
--------------------------------------

![ScreenShot](https://raw.githubusercontent.com/NuhaKhaled/Diversified-MiniJava/master/images/ProgramFlow.png)

❖ Lexical Analysis:

  The lexical Analysis takes input from .java file and tokenize it into tokens. Each token has type and its associated values and It’s line number. It’s Output is an Array of Program Tokens. The MainClass takes program file name from the user and pass it to the Tokenizer method. It uses ArrayList to save the list of tokens produced by the tokenizer.
  
  The Tokenizer uses FileReader and SteamTokenizer to read the file and split it. Then Switch cases are used on each token to create this Token and add it to the list.
  
  
  Each token is defined as Token Object.Token Object got type. terminals’ type is
  list of enum.
  public enum Type{
  EOF(0),ID(1), // identifier [a-zA-Z_][a-zA-Z_0-9]*
  INTLIT(2), // integer literal [0-9]+
  LBRACE(3), // {
  RBRACE(4), // }
  LSQR(5), // [
  RSQR(6), // ]
  LPAREN(7), // (
  RPAREN(8), // )
  COMMA(9), // ,
  .
  .
  .
  }
  
  While Token’s elements are :
  
  int type; //token type, a number representation from the enum
  int intVal; //If it is an INTEGER_LITERAL, it’s value is here
  public String id;//If it is an identifier, it’s name is here
  public int line_no;//line number of the token

❖ Parser And Abstract Syntax Tree Creation:

  We implemented the parser using recursive descent algorithm. A recursive descent parser is a kind of top-down parser built from a set of mutually recursive procedures ( or a non-recursive equivalent ) where each such procedure usually implements one of the production rules of the grammar. Thus the structure of resulting program closely mirrors that of the grammar it recognizes. The Parser is initialized and called from Main.java’s main.
  
  
  parse.Goal() starts parsing the ArrayList tokens. It is an implementation for The MainClass production Rule. Each production Rule is implemented as function that consumes the Tokens according to the grammar and return an ASTNode that represent it. In the end of Parsing MainClass ASTNode of the Whole Program is returned from The Goal to the main as mainclass.
  
  Data Structure used is Trees for AST Nodes Creation.

❖ Code Generation And Diversity

  Code Generation was done by a naive method : On the fly code generation. 
  
  Software process diversity has a great impact in many area. In our project, it is used in generating 3 different language from the MiniJava input. This would be useful in Software Reuse. Software reuse is the dominant approach nowadays for constructing many applications. The hardest step in Software Reuse is packaging and compiling more than one sources together and matching its to desired environment. By using the diversified outputs, It will be easier to match the reused code to the desired language code needed. The code go through the Abstract Syntax Tree to convert it to the matching Ruby, Python and JavaScript code.It’s Implementation is at ASTNode classes level.The user may choose only a specific language as an Output.
