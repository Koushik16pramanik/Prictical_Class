package Oerateor;

class Test{
void show() {
	System.out.println("Dynamic Bunding First");
	}}
public class Dynamicbunding extends Test{
	void show() {
		System.out.println("Dynamic Bunding Second");
	}
	public static void main(String args[]) {
		Test a=new Dynamicbunding();
		a.show();
	}
}
