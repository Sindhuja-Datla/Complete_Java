package variables;

public class Types1 {
		static int b=4;  // static variable
		
		int a=9;       // instance variable
	
	void test() {
		int c=8;        // local variable
		System.out.println("local variable: "+c);
	}
	

	public Types1() {
		++a;
		++b;
	}
	
	public static void main(String[] args) {
		
		Types1 t1=new Types1();
		Types1 t2=new Types1();		
		
		System.out.println("first obj: "+t1.a+" "+t1.b );  // b is 6 here - 2 instances
	

	}
	
	
	
	

}
