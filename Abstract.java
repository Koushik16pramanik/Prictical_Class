package Activity;

public abstract class Abstract {//parent class
	abstract void method(); // abstract method
	}
	class Tets extends Abstract{ //child class
		void method() { // non abstract method
			System.out.println("method running sucessfully");
		}}
		class Newtest extends Abstract{
			void method() {
				System.out.println("new test method running sucessfully");
			}
		public static void main(String args[]) {
		Abstract abs=new Newtest();
			abs.method();
}}