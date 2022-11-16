package Collection;

public interface FunctionalInterface {
	// void add();
	int add (int a, int b);
}
class LamdaE {
	public static void main(String[] args) {
		FunctionalInterface oj= (a,b)->{return (a+b);
	//	System.out.println("i am funcotional interface by lamda expression");
		};
		System.out.println(oj.add(40, 50));
	//	oj.add();
		}}

