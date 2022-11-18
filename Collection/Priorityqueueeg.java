package Collection;
import java.util.*;

public class Priorityqueueeg {
	public static void main(String[] args) {
		
		PriorityQueue<String> queue= new PriorityQueue<String>();
		queue.add("Prakash");
		queue.add("Sayan");
		queue.add("Sankhajit");
		queue.add("Hasan");
		queue.add("Jaita");
		queue.add("Owashim");
		queue.add("Tanmay");
		System.out.println("head:" +queue.element());
		System.out.println("head:" +queue.peek());
		System.out.println("Iterating the elements");
		Iterator itr= queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.hasNext());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing");
		Iterator<String> itr1= queue.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}}}
