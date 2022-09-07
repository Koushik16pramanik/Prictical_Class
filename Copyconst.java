package Oerateor;

public class Copyconst {
	//variable along with data type
	int age;
	String name;
	// constructor & initialize
	Copyconst(int a, String n){
	age=a;
	name=n;
	}
	
	/*copy const to initialize anther obj
	Copyconst (Copyconst c){
		age=c.age;
		name=c.name;
	}*/
	//method
	Copyconst(){}
	void show() {
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		Copyconst c1=new Copyconst (22,"Koushik");
		Copyconst c2=new Copyconst();
		c1.show();
		c2.show();

	}

}
