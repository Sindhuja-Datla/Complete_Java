package dataTypes;

public class TypeCastingAndConversion {

	public static void main(String[] args) {
		
			int a=10;
			byte b=34;
			int c=257;
			double d=67.5;
			
		// type conversion --- implicit (automatic)
			int bb=b;
			double cc=c;
			System.out.println(bb+" "+cc);
			
		// type casting --- explicit (casting operator)
			int aa=(int)b;   // from int to byte
			double dd=(double)a;
			System.out.println(aa+" "+dd);
			double aaa=256.50;
			int bbb=(int)aaa;
			System.out.println(bbb);
			
		// type promotion
			byte x=20;
			byte y=30;
			// byte z=(byte) (x*y);
			int z=x*y;
			System.out.println(z);
			
			
			
			
	}

}
