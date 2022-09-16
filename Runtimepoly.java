package Oerateor;

class Runtimepoly {
void show() {
	System.out.println("show anything");
	}}
class Abcd extends Runtimepoly{
	void show() {
		System.out.println("show nothing");
	}
public static void main(String[] args) {
	Runtimepoly t=new Abcd();
	t.show();
}}