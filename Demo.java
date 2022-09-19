package Activity;

public interface Demo {// interface declaration
	void display();
	}
	class DemoTet implements Demo{// 1st implementation
		public void display () {
			System.out.println(" Display ");
		}}
	class DemoTest1 implements Demo{// 2nd implementation
		public void display() {
			System.out.println("Display 1");
		}
	public static void main(String...args) {
		Demo ob=new DemoTest1();
		ob.display();
}}