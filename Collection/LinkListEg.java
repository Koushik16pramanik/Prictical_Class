package Collection;
import java.util.*;

public class LinkListEg {

	public static void main(String[] args) {
		LinkedList<String> l= new LinkedList<String>();
		l.add("Arnab");
		l.add("Jack");
		l.add("Koushik");
		Iterator<String> itr= l.iterator();
		while (itr.hasNext()) 
			System.out.println(itr.next());
		}}

