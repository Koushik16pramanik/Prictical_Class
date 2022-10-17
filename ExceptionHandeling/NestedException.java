package ExceptionHandling;
import java.util.*;

class NestedException {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	try {
	int x =s.nextInt();
	int y= s.nextInt();
	System.out.println(" " + (x/y));
	}
	catch(InputMismatchException d) {
		System.out.println(d);
	}
	catch (Exception d) {
		System.out.println(d);
	}}}