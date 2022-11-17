package Pratic;
import java.util.*;

public class Demo {
	public static Boolean compareList(ArrayList al2, ArrayList al3) {
		return al2.toString().contentEquals(al3.toString())?true:false;
	}
	public static void main(String...args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rose");
		al.add("Sunflower");
		al.add("Lotas");
		al.add("Orchid");
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Rose");
		al1.add("Lavender");
		al1.add("Lotas");
		al1.add("Jasmine");
		
		Collections.reverse(al);
		System.out.println(al);
		System.out.println(compareList(al, al1));
		System.out.println("using Array.contains "+al.contains(al1));
		System.out.println("using containt equals "+ al.equals(al1));
        System.out.println("remove all: "+al1.removeAll(al1));
        System.out.println("using compare equal "+al.containsAll(al1));
        System.out.println("using retainall "+al.retainAll(al1));
        
	}

}
