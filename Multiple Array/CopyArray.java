package Activity;

public class CopyArray {//class
	public static void main(String[] args) {
	// Declaring a source array
		char[]copyFrom= {'d','e','f','f','e','i','n'};
		// Declaring a destination array
		char[]copyTo=new char[7];
		System.arraycopy(copyFrom,1,copyTo,0,6);
		// print the destination array
		System.out.println(String.valueOf(copyTo));
	}}