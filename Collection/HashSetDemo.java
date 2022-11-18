package Collection;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		// Creating HashSet and adding elements
		HashSet<String> set= new HashSet<String>();
		set.add("ram");
		set.add("rima");
		set.add("ram");
		set.add("ramesh");
		System.out.println("Original list:"+set);
		HashSet<String> set1= new HashSet<String>();
		set1.add("Sourav");
		set1.add("Ramesh");
		System.out.println("New set:"+set1);
		set.addAll(set1);
		System.out.println("updated list:"+set);
		// remove all he new elements
		set.removeAll(set1);
		// remove all
		set.clear();
		System.out.println("present list:"+set);

	}}

