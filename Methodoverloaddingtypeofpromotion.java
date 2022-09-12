package Activity;

public class Methodoverloaddingtypeofpromotion {
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(long a, long b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Methodoverloaddingtypeofpromotion obj=new Methodoverloaddingtypeofpromotion();
		obj.add(2, 3);

	}

}
