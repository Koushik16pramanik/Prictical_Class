package Oerateor;

public class StaticVariable {
	int roll;
	String name;
	float fee;
	static String college="ABC";
	StaticVariable(int roll, String name, float fee){
		this.roll=roll;
		this.name= name;
		this.fee=fee;
	}
	void show() {
		System.out.println(roll+" "+name+" "+fee+ " "+college);
	}
public class StaticVariable1{
	public static void main(String[] args) {
		StaticVariable s1=new StaticVariable(275,"rick",620);
		StaticVariable s2=new StaticVariable(364,"rick",750);
		s1.show();
		s2.show();
	}}}
