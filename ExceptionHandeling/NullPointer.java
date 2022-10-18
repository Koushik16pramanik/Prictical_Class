package ExceptionHandling;
// invoked method on the null object
public class NullPointer {
	// int a= 10;
	//public static NullPointer koushik() {  // method invoked by using null object
		//return null;
	 String str= null; // string value null
	 int arr[]=null;  // array object null
	 String convert (String s) {
	 return s.toUpperCase();
	 }
	 public static void main(String...args) {
		 NullPointer obj= new NullPointer();
		//NullPointer obj= NullPointer.koushik();
		System.out.println(obj.convert(null)); // through method passing arguments as null
		System.out.println(obj.arr.length);
		System.out.println(obj.str.equals("Koushik"));
		//System.out.println(obj.a);
	}}