package Multithreaing;

public class ThreadCon implements Runnable {
	public void run() {
		System.out.println("Thread activated");
	}
	public static void main(String[] args) {
		Runnable r= new ThreadCon();  // creating obj of thread cons class
		Thread obj= new Thread(r,"Koushik"); // using thread (runnable r, String name)
		obj.start(); // move to active state
		String str= obj.getName(); // thread name by invoking get name method
		System.out.println(str);
	}}
