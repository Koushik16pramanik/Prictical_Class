package Activity;
//parent class
class Shape1 {
	void print() {
		System.out.println("print circle");
	}}
class Size1 extends Shape1{//child class
	void print() { // same method of parent class(child class method)
		System.out.println("print triangle");
	}
	void display() { //new method of child class
		System.out.println("print nothing");
	}
void show() {
	super.print();
	display();
}}
class supermethod{
	public static void main(String args[]) {
		Size1 obj=new Size1();
		obj.display();
}}