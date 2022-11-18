package Collection;
import java.util.*;
public class Vectoreg {
	public static void main(String[] args) {
		//creating vertor
		Vector<String> v=new Vector<String>(3);
		v.add("dog");
		v.add("cat");
		v.add(0,"cow");
		//check size and capacity
		System.out.println("sixe: " +v.size());
		System.out.println("capacity: " +v.capacity());
		v.addElement("tiger");
		v.addElement("lion");
		System.out.println("after adding");
		System.out.println("size: "+v.size());
		System.out.println("size: "+v.capacity());//old capacity*3/2+1
		System.out.println(v);
		if(v.contains("cat")) {
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
		//getting 1st element
		System.out.println("1st element: "+v.firstElement());
		//getting last
		System.out.println("last ele: "+v.lastElement());
		//checking index
		System.out.println("index: "+v.indexOf("tiger"));
	}

}
