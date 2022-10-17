package ExceptionHandling;

// only 1st exception will execute (multiple catch)
 class Multicatch {
static void mFunc() {
	try {
		int i= 50/0;  //Arithmetic  // 50/2
		System.out.println(i); // Arithmetic
		int arr[]= new int[3];  // ArrayIndexOutOfBoundsException
		arr[4]= 24;
	}
	catch (ArithmeticException d) {
		System.out.println(d);
	}
	catch (ArrayIndexOutOfBoundsException d) {
		System.out.println(d);
	}
	finally {
		System.out.println("I am finally block");
	}}
public static void main(String args[]) {
	mFunc();
}}