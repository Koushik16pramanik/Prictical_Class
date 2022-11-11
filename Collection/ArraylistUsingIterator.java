package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistUsingIterator {
	public static void main(String[] args) {
		List<String> al= new ArrayList<String>();  // creating a arraylist
		al.add("Rose");
		al.add(0,"Lily");
		al.add("Tulip");
		al.add("Marigold");
		al.add("Daisy");
		al.add("Orchid");
		al.add("Jasmine");
		
		System.out.println("traversing using for loop");
		for (int i= 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("traversing using for loop");
		for (String a : al) {
			System.out.println(a);
		}
		System.out.println("traversing using for iterator");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}
		System.out.println("traversing using for iterator-forward");
		ListIterator<String> itr1= al.listIterator();
		while (itr1.hasNext()) {
		System.out.println(itr1.next());
		}
		System.out.println("traversing using for iterator-backword");
		ListIterator<String> itr2= al.listIterator(al.size());
		while (itr2.hasPrevious()) {
		System.out.println(itr2.hasPrevious());

	}}}
