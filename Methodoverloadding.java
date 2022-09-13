package Activity;

public class Methodoverloadding {
	static int add(int a,int b) {  // two argument
		return a+b;
	}
	static int add(int a,int b,int c) {    // three argument
		return a+b+c;
	}
	class Test{
		
	}
		public static void main(String[] args) {
			System.out.println(Methodoverloadding.add(7, 3) );
			System.out.println(Methodoverloadding.add(9, 8,4) );
}}