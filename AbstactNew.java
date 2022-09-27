package Oerateor;

//an abstract class which has abstract,non abstract and constructor.
public  abstract class AbstactNew {//parent class
	AbstactNew(){//constructor
		System.out.println(" constructor created");
	}
	abstract void show();//abstract method
	 void method1(){// non abstract method
		 
		System.out.println("method 1 created");
		}}
	 		class Anything extends AbstactNew{//child class 
			void show() 
			{
				System.out.println(" method running successfully");
			}
			public static void main(String[] args) {
				AbstactNew obj=new Anything();
				obj.method1();
				obj.show();
			}}