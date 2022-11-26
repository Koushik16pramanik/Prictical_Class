package threading;

public class DeadlockEg {

	public static void main(String[] args) {
		final String a="Akash";
		final String b="Dev";
		Thread t1=new Thread() {
			public void run() {
				synchronized (a) {
					System.out.println("t1 lock a : ");
					try {
						Thread.sleep(200);
					}catch(Exception e) {
					}
					synchronized (b) {
						System.out.println("t1 lock b : ");
				}
			}
		}
	};
	Thread t2=new Thread() {
		public void run() {
			synchronized (b) {
				System.out.println("t1 lock b : ");
				try {
					Thread.sleep(200);
				}catch(Exception e) {
				}
				synchronized (a) {
					System.out.println("t1 lock a : ");
			}
		}
	}
};
t1.start();
t2.start();
	}}
