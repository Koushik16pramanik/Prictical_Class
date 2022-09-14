package Activity;

class Shape {
	String name= "circle";}
class Size extends Shape{
	String name= "Traingle";
	void displayname() {
		System.out.println(name);
		System.out.println(super.name);
	}}
class superIV{
	public static void main(String args[]) {
		Size obj=new Size();
		obj.displayname();
	}}