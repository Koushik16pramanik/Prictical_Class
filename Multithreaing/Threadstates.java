package Multithreaing;
// using runnable class
public class Threadstates implements Runnable {
		public void run() {
		System.out.println("thread activated");	
		}
	public static void main(String[] args) {
		Threadstates obj = new Threadstates();
		Thread t1= new Thread(obj);
		t1.start();
	}}
