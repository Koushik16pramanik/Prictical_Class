package Activity;

class Area{
	int squre(int a) {
		return a*a;
	}
}

public class Circle1 {
	Area ref;
	double pi=3.14;
	double area (int radius){
		ref= new Area();
		int squre1=ref.squre(radius);
		return pi*squre1;
	}
	
	public static void main(String[] args) {
		Circle1 obj=new Circle1();
		double result=obj.area(6);
		System.out.println(result);

	}
}