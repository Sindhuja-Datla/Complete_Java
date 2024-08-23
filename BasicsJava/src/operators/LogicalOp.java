package operators;

public class LogicalOp {

	public static void main(String[] args) {

		int a=10;
		int b=3;
		int c=4;
		int d=1;
		
	 // && || !
		
		boolean x=(a>b)&&(c>d);
		System.out.println(x);
		
		boolean y=(a<b)||(c<d);
		System.out.println(y);
		
		boolean z=!(a>b);
		System.out.println(z);
	}

}
