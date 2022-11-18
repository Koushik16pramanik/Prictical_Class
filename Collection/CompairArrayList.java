package Collection;
import java.util.*;

public class CompairArrayList {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>(); 	// 1st arraylist integer type
		// adding elements 
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		List<Integer> al2=new ArrayList<>();	// 2nd arraylist integer type
		// adding elements 
		al2.add(0);
		al2.add(5);
		al2.add(6);
		al2.add(2);
		
		List<Integer> al3=new ArrayList<>();	// 3rd arraylist integer type
		// adding elements 
		al3.add(0);
		al3.add(9);
		al3.add(7);
		al3.add(8);
	
		List<String> str=new ArrayList<>();	// 4th arraylist String type
		// adding elements 
		str.add("a");
		str.add("b");
		str.add("c");
		str.add("d");
	
		List<String> str2=new ArrayList<>();	// 5th arraylist String type
		// adding elements 
		str2.add("e");
		str2.add("i");
		str2.add("g");
		str2.add("h");
	  
		System.out.println(al.equals(al3)); 				// checking whether equal or not using equal() method
		System.out.println(al.retainAll(al3)); 				// retainall() method to store the common elements
		System.out.println(al.containsAll(al3)); 			// containsAll() method to check whether al stores all of the elements of al3
		System.out.println(al2.removeAll(al3)); 			// removeall() method to remove all elements of al3 from al2
		System.out.println(al.contains(al)); 				// contains method - false because one arraylist can't contain itself
		System.out.println(str.toString().contentEquals(str2.toString())); // contentEqual() method 
}}
