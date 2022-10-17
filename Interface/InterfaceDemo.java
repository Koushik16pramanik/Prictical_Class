package Oerateor;

public interface InterfaceDemo {
void display();
}
class Oooo implements InterfaceDemo{
	 public void display() {
		System.out.println("example 1 : ");
	}
	 public static void main(String[] args) {
		Oooo oo=new Oooo();
		oo.display();
	}}