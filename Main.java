import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.*;

public class Main {


static ArrayList<Token> list = new ArrayList <Token>();

 public static void main(String[] args) throws Exception
	    {
         ArrayList<Token> list = new ArrayList <Token>();
         
		Scanner input = new Scanner(System.in);
         System.out.println("Input file path please:");
         String x = input.nextLine();
         input.close();
		 list = Tokenizer.tokenizer(x);
		
		 Parser parse = new Parser(list);
		 ASTMainClass mainclass = parse.Goal();
	 String print = mainclass.toString();
		 
		 System.out.println("Your Code: ");

		 System.out.println(print);
		 
		 System.out.println("Parsing Tree: ");

		 mainclass.dump("");
		 
		 System.out.println("\nRuby Code: ");
		 String Ruby = mainclass.toRuby();


		 System.out.println(Ruby);
		 
		 System.out.println("JavaScript Code: ");
		 String JS = mainclass.toJS();


		 System.out.println(JS);
		 
		 System.out.println("Python Code: ");
		 String Py = mainclass.toPython("");
		 System.out.println(Py);



		 
	
		  	      }
			  


	    }
