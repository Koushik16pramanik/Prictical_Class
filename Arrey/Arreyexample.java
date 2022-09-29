package Activity;

public class Arreyexample {
	public static void main(String[] args) {
		display(new int[]{ 10,20,30,40,50});//passing anonymous array
		}
	//no need to declare the array while passing an array to the method
			 static void display(int arr[]) {
			 for(int i=0;i<=arr.length-1;i++)
					System.out.println(arr[i]);
			}}