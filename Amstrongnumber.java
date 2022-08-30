package Activity;

import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
		int i,sum=0,digit;
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter i : ");
		i=sc.nextInt();
		n=i;
		while(i!=0) {
			digit=n%10;
			sum=sum+(digit*digit*digit);
			i=i/10;
		}
	if(n==sum) {
		System.out.println("armstrong number");
	}
	else {
		System.out.println("not armstrong number");
	}
	}

}
