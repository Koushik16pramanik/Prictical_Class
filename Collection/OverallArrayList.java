package Collection;
import java.util.*;
// using get() & set() method
public class OverallArrayList {
	public static void main(String[] args) {
		List al = new ArrayList (); // non generic
		List<String> al1 = new ArrayList<String>();  // declaring ArrayList using List
		// method add() --- we can add the element in the list
		al1.add("Rose");
		al1.add("Sunflower");
		al1.add("Lotas");
		al1.add("Orchid");
		al1.add("Tulip");
		al1.add("Jasmine");
		al1.add("MariGold");
	//	System.out.println("get the element:"+al1.get(1));  // aacess the element
	//	al1.set(1, "Tulip");  // change the element
		Collections.sort(al1); // sorting
		for (String Flower:al1)
		System.out.println(Flower);
		
		List<Integer> al2 = new ArrayList<Integer>();  // declaring ArrayList using List
		// method add() --- we can add the element in the list
		al2.add(52);
		al2.add(20);
		al2.add(15);
		Collections.sort(al2);
		for (Integer Number:al2)
		System.out.println(Number);
		System.out.println("Array List empty or not?:" +al1.isEmpty());
		al1.retainAll(al2);
		System.out.println("The size of the arraylist:"+al2.size());
	}}
