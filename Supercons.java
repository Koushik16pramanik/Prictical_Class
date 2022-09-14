package Activity;
//parent class
class Shape2 {
	//constructor of parent class
	public Shape2(){System.out.println("Hello");}
}
class Size2	extends Shape2{ //child class
	Size2(){
		//invoke immediate parent class constructor line new child class
		//super();
		System.out.println("hi");
	}}
	
class Supercons{
	public static void main(String args[]) {
		Size2 obj=new Size2();
	}}
