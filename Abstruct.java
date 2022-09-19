package Activity;

public abstract class Abstruct {//parent class
	abstract void method(); // abstract method
	}
	class Tet extends Abstruct{ //child class
		void method() {
			System.out.println("method running sucessfully");
		}
		public static void main(String args[]) {
		Abstruct abs=new Tet();
			abs.method();
		}}