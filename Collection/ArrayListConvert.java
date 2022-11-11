package Collection;
import java.lang.reflect.Array;
import java.util.*;

public class ArrayListConvert {
public static void main(String[] args) {
		List<String> al= new ArrayList<String>();  // creating a arraylist
		al.add("Rose");
		al.add(0,"Lily");
		al.add("Tulip");
		al.add("Marigold");
		al.add("Daisy");
		al.add("Orchid");
		al.add("Jasmine");
		// convertion of list to array
		System.out.println("List to array");
		String []arr = al.toArray(new String[al.size()]);
		for (String s : arr) {
			System.out.println(s);
		}
		// array to list
		System.out.println("Array to List");
		List<String> all= new ArrayList<String>();
		all = Arrays.asList(arr);
		System.out.println(all);
	}}
