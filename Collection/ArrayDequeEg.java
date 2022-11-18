package Collection;
import java.util.*;

public class ArrayDequeEg {
	public static void main(String[] args) {
		
		Deque<String> dq= new ArrayDeque<String>();
		dq.add("Ram");
		dq.add("Karan");
		dq.add("Riya");
		dq.add("Priya");
		dq.add("Sam");
		dq.add("Ajay");
		for(String s : dq) {
		System.out.println();
		dq.addFirst("Shree");
		dq.addLast("Riya");
		System.out.println("New List");
		for (String s1 : dq) {
			System.out.println(s1);
		}
		dq.removeFirst();
		dq.removeLast();
		System.out.println("new list after Removel");
		for (String s2 : dq) {
			System.out.println(s2);
		}}}}
		
