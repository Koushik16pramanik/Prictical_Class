package Multithreaing;

public class SequentialEg {
	public void run() {
		for(int i= 5; i<=11; i++) {
			try {
		Thread.sleep(200);  // The thread sleep/ stop working for a specific amount of time.
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}}
	public static void main(String args[]) {
		SequentialEg t1= new SequentialEg();
		SequentialEg t2 =new SequentialEg();
		SequentialEg t3 = new SequentialEg();
		t1.run();
		t2.run();
		t3.run();
	}} // 5 6 7 8 9 10 11 5 6 7 8 9 10 11 5 6  7 8 9 10 11
