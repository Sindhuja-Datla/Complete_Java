package operators;

public class UnaryOp {

	public static void main(String[] args) {

		int a=4;
		System.out.println(-a);
		System.out.println(~a);
		System.out.println(!(a>2));
		System.out.println(++a+" "+a++);
		System.out.println(--a+" "+a--);
	}

}
