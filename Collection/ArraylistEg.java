package Collection;

import java.util.*;
public class ArraylistEg {
	public static void main(String[] args) {
		List<String> al= new ArrayList<String>();   // declaring arraylist using list
		// method add() --- we can add the element in the list
		al.add("Rose");
		al.add("Sunflower");
		al.add("Rose");
		al.add(0,"Lily");
		al.add("Tulip");
		al.add("Marigold");
		al.add("Daisy");
		al.add("Orchid");
		al.add("Jasmine");
		al.add("Lotus");
		al.add(5,"Lavender");  // add the element end of the list
		
		System.out.println(al);
		System.err.println("Size of Array List :" +al.size());  // define the no elements using size()
		System.out.println("element of index value is:"+al.get(6));  // specific element of given index using get()
		al.remove(6);  // remove any element from list using remove()
		System.out.println(al);
		System.err.println("Size of Array List :" +al.size());
	}}
