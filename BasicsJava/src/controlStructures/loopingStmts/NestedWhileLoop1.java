package controlStructures.loopingStmts;

public class NestedWhileLoop1 {

	public static void main(String[] args) {
		
		int i=1;
		int j=2;
		
		while(i<4) {
			System.out.println("i"+i);
			while(j<4) {
				System.out.println("j"+j);
				j++;
			}
			i++;
		}
		
	}

}
