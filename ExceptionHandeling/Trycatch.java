package ExceptionHandling;

import java.rmi.AccessException;

public class Trycatch {
	public static void main(String[] args) {
		try {
			int num = 25/0; // may exception occure
			System.out.println("This line not exciute");
		} // catch (ArthmeticException d) {
		catch(Exception k) { // handling exception
		System.out.println(25/5);
		}
		//System.out.println("This code will run");
		}}
