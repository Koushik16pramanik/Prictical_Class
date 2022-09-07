package Oerateor;

public class Thiskeyword {
	int roll;
	String name;
	float fee;
	
	Thiskeyword(int roll, String name, float fee){
		this.roll=roll;
		this.name= name;
		this.fee=fee;
	}
	void show() {
		System.out.println(roll+" "+name+" "+fee);
	}
  class Test{
	public static void main(String[] args) {
		
		Thiskeyword s1=new Thiskeyword(180,"souvik",500);
		Thiskeyword s2=new Thiskeyword(320,"souvik",700);
		//s1.change();
		s1.show();
		s2.show();
	}
	}

}
