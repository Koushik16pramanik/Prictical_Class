package Oerateor;

public class Parameterizedcons {
		
		int age;
		String name;
		Parameterizedcons(int a, String n) {
			age=a;
			name=n;
		}
		void show() {
			System.out.println(age+" "+name);
		}
	public static void main(String[] args) {
		Parameterizedcons d=new Parameterizedcons(50,"Sourav");
		Parameterizedcons d1=new Parameterizedcons(25,"Koushik");
		d.show();
		d1.show();
	}

}
