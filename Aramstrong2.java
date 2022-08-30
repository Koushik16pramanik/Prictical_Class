package Activity;

import java.util.Scanner;

public class Aramstrong2 {

	public static void main(String[] args) {
		int number, temp, reminder, time = 0;
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter number: ");
		number = sc.nextInt();
		temp=number;
		while(temp!=0) {
			time = time + 1;
			temp=temp/10;
		}
		temp=number;
		while(temp>0) {
			reminder=temp%10;
			sum=sum+Math.pow(reminder,  time);
			temp=temp/10;
			
		}
		System.out.format("\n sum of entered is= %.2f", sum);
		if (sum == number) {
		System.out.format("\n% d is a Armngstrong", number);
		
	}
		else {
			System.out.format("\n% d is not", number);
			
		}
}}
