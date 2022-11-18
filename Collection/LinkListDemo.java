package Collection;
import java.util.*;

public class LinkListDemo {
	public static void main(String[] args) {
		LinkedList<String> a=new LinkedList<String>();
		a.add("Rose");
		a.add("Marigold");
		a.add("Lotas");
		a.add("Sunflower");
		a.add("Daisy");
		a.add("Orchid");
		System.out.println(a);
		System.out.println("after adding");
		a.add(2, "Jasmine");
		//2nd list and elements
		LinkedList<String> b=new LinkedList<String>();
		b.add("Lily");
		b.add("Tulip");
		System.out.println("new");
		System.out.println(b);
		//add elements of b in a
		a.addAll(b);
		//add element of b in a's 3 index position
		a.addAll(3, b);
		a.addFirst("skill");//add at first position
		a.addLast("development");//add at last position
		System.out.println("new: " +a);
		a.remove("Daisy");//remove
		a.removeAll(b);//remove b's element
		a.removeFirst();//remove from 1st position
		a.removeLast();//remove from last position
		a.removeFirstOccurrence("Lavender");//remove 1st where found
		a.removeLastOccurrence("Lavender");//remove last where found
		//a.clear();//clear
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		//traversing in reverse order
		//Collection.reverse(a);
		Iterator i=a.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next());
	}}
