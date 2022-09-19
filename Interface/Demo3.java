package Interface;
// Achieve multiple inheritance using interfaces
public interface Demo3 { //1st interface
void show();
}
interface Demo4{ //2nd interface
	void print();
}
class Example22 implements Demo3,Demo4{
	public void show() {
		System.out.println("show");
	}
	public void print() {
		System.out.println("print");
	}
public static
void main(String[] args) {
	Example22 ob=new Example22();
	ob.show();
	ob.print();
}}