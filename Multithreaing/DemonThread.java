package Multithreaing;

public class DemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("I am Demon");
	}	else {
		System.out.println("I am user");
	}}
	public static void main(String[] args) {
		DemonThread t = new DemonThread();
		DemonThread t1= new DemonThread();
		DemonThread t2 = new DemonThread();
		
		t1.setDaemon(true);
		t.start();
		t1.start();
		 t2.start();
	}}