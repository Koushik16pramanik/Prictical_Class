package Activity;
//parent class
class Shape {
	String name= "circle";} // data memberof parent class
class Size extends Shape{
	String name= "Traingle";
	void displayname() { //method
		System.out.println(name); //display the name of the size class
		System.out.println(super.name); // display the name of the shape class
	}}
class superIV{
	public static void main(String args[]) {
		Size obj=new Size();
		obj.displayname();
	}}
