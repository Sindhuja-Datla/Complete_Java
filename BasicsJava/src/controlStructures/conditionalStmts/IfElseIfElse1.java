package controlStructures.conditionalStmts;


// greatest of three numbers

public class IfElseIfElse1 {

	public static void main(String[] args) {
		int a=6; 
		int b=7;
		int c=9;
		if(a>b && a>c)
			System.out.println("a is greater");
		else if(b>c) 
			System.out.println("b is greater");
		else
				System.out.println("c is greater");
		
	}

}
