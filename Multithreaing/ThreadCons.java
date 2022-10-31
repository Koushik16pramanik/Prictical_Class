package Multithreaing;

public class ThreadCons {

	public static void main(String[] args) {
		Thread obj = new Thread("Koushik"); // using the constructor thread (String name)
		obj.start(); // move to active state
		String str = obj.getName(); // thread name by invoking get name method
		System.out.println(str);
	}}
