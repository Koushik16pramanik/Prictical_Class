package Oerateor;

public class Staticmethod5 {
	int roll;
	String name;
	float fee;
	static String college="ABC";
	static void change() {
		college="CAB";
	}
	Staticmethod5(int roll, String name, float fee){
		this.roll=roll;
		this.name= name;
		this.fee=fee;
	}
	void show() {
		System.out.println(roll+" "+name+" "+fee+ " "+college);
	}
  class StaticMethod{
	public static void main(String[] args) {
		Staticmethod5.change();
		Staticmethod5 s1=new Staticmethod5(180,"sourav",420);
		Staticmethod5 s2=new Staticmethod5(220,"sourav",520);
		//s1.change();
		s1.show();
		s2.show();
	}
	}

}
