package Collection;

import java.util.*;

public class Stackeg {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		boolean b=s.empty();
		System.out.println("is empty?"+b);
		//adding element(push)
		s.push(6);
		s.push(60);
		s.push(54);
		s.push(44);
		s.push(32);
		//result
		System.out.println(s);
		Integer i=s.peek();
		System.out.println(i);
		Integer j=s.pop();
		System.out.println(j);
		//search
		int digit=s.search(54);
		System.out.println(digit);
		//size
		int x=s.size();
		System.out.println(x);
	}}
