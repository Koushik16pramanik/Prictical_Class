package Oerateor;

class Zoo1 {
	int a=10; 
	void bark(){
	System.out.println("barking");
	}}
class Cat extends Zoo1{
	int a=20;
	void  bark() {
		System.out.println("meow");
	}}
class Dog extends Cat{
	int a=30;
	void bark(){
		System.out.println("baff");
	}}
class Zoo{
	public static void main(String[] args) {
		//Reference veriable of parent class with the child class object
		Zoo1 z;
		z=new Cat();
		z.bark();
		System.out.println(z.a);
		z=new Dog();
		z.bark();
	}}