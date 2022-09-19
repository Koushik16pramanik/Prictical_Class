package Interface;

interface Abstraction1 {
// By default all method in interface public & abstract.
	void show();
	void display();
	void print();
}
//creating a sub-class that implement one of this method
abstract class AbsClass implements Abstraction1{
	public void show() {
		System.out.println("Hallo");
	}
}
//creating a sub-class of the abstract class that
//method
class Class2 extends AbsClass{
	public void display() {
		System.out.println("Print");
	}
	public void print() {
		System.out.println("HI");
	}}
public class Abstraction{
	public static void main(String[] args) {
		Abstraction1 obj=new Class2();
		obj.show();
		obj.print();
		obj.display();
	}
}
