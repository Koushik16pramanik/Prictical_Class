package ExceptionHandling;
// example of throw unchecked exception --- runtime
public class ThrowUnchecked {
	public static void eligible(int age) { // to check weather person is eligible or not
		if(age<18) {
			// throw arithmetic exception if person age is <18
			throw new ArithmeticException("u are not eligible for vote");
		}
		else {
			System.out.println("person eligible for vote");
		}}
	public static void main(String[] args) {
		eligible(16);
		System.out.println("done");
	}}