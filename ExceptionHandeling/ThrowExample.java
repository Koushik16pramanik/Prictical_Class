package ExceptionHandling;

// whether the student is pass or not
public class ThrowExample {
public static void myDisplay(int a) throws ArithmeticException {
if (a>=0 && a<=35) {
throw new ArithmeticException ("Value cannot less than 35 ");
	}
else {
	System.out.println("person eligible for vote ");
	}}
public static void main(String[] args) {
	myDisplay(30);  // predefined value
	}}