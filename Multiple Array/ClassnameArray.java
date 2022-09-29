package Activity;
// to get class name of array in java
public class ClassnameArray {
	public static void main(String[] args) {
	// Declaration & initialization of an Array
		int arr[]= {1,2,3};
		//getting the class name
		Class a=arr.getClass();
		String name=a.getName();
		// print the class name
		System.out.println(a);
	}}