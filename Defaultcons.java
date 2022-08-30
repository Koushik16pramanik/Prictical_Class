package Oerateor;

public class Defaultcons {
		String name;
		int age;
		void show() {     //method to display age and name
			System.out.println(age+" "+name);
		}
	public static void main(String[] args) {
		Defaultcons d=new Defaultcons();
		Defaultcons d1=new Defaultcons();
		d.show();
		d1.show();
		

	}

}
