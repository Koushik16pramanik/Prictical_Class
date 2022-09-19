package Activity;

public interface Demo1 { // interface declaration
void display();
}
class DemoTest implements Demo1{ // implementation
	public void display () {
		System.out.println(" hallo world ");
	}
public static void main(String...args) {
	DemoTest ob=new DemoTest();
	ob.display();
}}
