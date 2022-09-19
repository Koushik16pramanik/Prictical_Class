package Interface;
//default & static method in interface (since java 8)
interface Abc {
void print(); //abstract 1
//no need to define method. 
default void show() {// default 1
	System.out.println("hi");
}
static void hello() {//static method
	System.out.println("inside static method");
}}
public class Twoinonemethod implements Abc{
	public void print() {
		System.out.println("in print method");
	}
	public static void main(String[] args) {
		Abc app=new Twoinonemethod();
		app.show();
		app.print();
		Abc.hello(); // calling static method using interface name
	}}