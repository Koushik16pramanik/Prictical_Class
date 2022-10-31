package Multithreaing;
//  using thread class
public class ThreadState extends Thread {
	public void run() {
		System.out.println("Thread activated");
	}
	public static void main(String[] args) {
		ThreadState obj= new ThreadState();
		obj.start();
	}}
