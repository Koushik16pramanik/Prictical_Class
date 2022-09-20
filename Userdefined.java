package Oerateor;

import java.util.*;

public class Userdefined {

	public static void main(String[] args) {
		// create scanner class object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		//taking input from user
		int num = sc.nextInt();
		//method body
		checkEvenOdd(num);
	} //user defined method
		public static void checkEvenOdd(int num) {
			// method body
			if(num%2==0)
				System.out.println(num+" is even");
			else
				System.out.println(num+" is odd");
	}}
