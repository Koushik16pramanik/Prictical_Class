package ExceptionHandling;
import java.util.*;

// castom exception example
 class InvalidAgeException extends Exception {
	 public InvalidAgeException(String str) {
		 super(str);
	 }}
 class CustomException {
	 public void checkAge(int age) throws InvalidAgeException {
		 if (age<=18 || age>=25) {
			 throw new InvalidAgeException("Invalid age for enroll into java course");
		 }
		 else {
			 System.out.println("Proper age for  enrolling in java course");
		 }}
	 public static void main(String[] args) throws InvalidAgeException {
		 CustomException c= new CustomException();
		 Scanner s= new Scanner(System.in);
		 System.out.println("Enter your age");
		 int age =s.nextInt();
		 c.checkAge(age);
		 //c.checkAge(17); // Predefined
	 	}}