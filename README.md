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
MiniJava is a subset of Java and the meaning of a MiniJava program is given by its meaning as a Java program.The grammar had the formal BNF for MiniJava. It defines a set of productions starting the MainClass which describe how sequences of tokens can form syntactically correct MiniJava programs. This is an LALR(1) grammar. It was not an LL(1) grammar because it had left-recursion. First, we simplified and removed the left-recursion in the grammar.The used grammar became :
  
![ScreenShot](https://raw.githubusercontent.com/NuhaKhaled/Diversified-MiniJava/master/images/Grammer%202.png)
