package Oerateor;

//default and static methods within an Interface.
interface Default1{  
void draw();  //abstract method
static int cube(int x) {//static method
	return x*x*x;
}
default void msg(){System.out.println("default method");}  //default method
}  
class Rectangle1 implements Default1{  
public void draw(){System.out.println("drawing rectangle");}  //non abstract method
}  
class TestInterfaceDefault{  
public static void main(String args[]){  
	Default1 d=new Rectangle1();  
d.draw();  
d.msg();
System.out.println(Default1.cube(4));
}}