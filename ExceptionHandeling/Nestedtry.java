package ExceptionHandling;

public class Nestedtry {
	public static void main(String[] args) {
	try {	// Outer try block
	try {   // Inner try block 1
	System.out.println("going to divide by 0");
	int b= 19/0;
	}
	catch (ArithmeticException e) {  // catch block of inner try block 1
	System.out.println(e);	
	}
	try {  // inner try block 2
	int a[]= new int[5];
	a[6]= 4; // aggigning the value out of arry bounds
	}
	catch (ArrayIndexOutOfBoundsException e) {  // catch block of outer try block
	System.out.println(e);
	}
	System.out.println("Other Statement");
	}
	catch (Exception e) { // catch block of outer try block
	System.out.println("Handled the exception (outer catch)");
	}
	System.out.println("normal flow..");
	}}