package Oerateor;

public abstract class Abstract {//parent class
abstract void method();// abstract method
}
class Test extends Abstract{//child class 
	void method() // non abstract method
	{
		System.out.println(" method running successfully");
	}}
class NewTest extends Abstract{//child class 2
	void method() {
		System.out.println(" new test method running successfully");
	}
	public static void main(String[] args) {
		Abstract abs=new NewTest();
		abs.method();
	}}