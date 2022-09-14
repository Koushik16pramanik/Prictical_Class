package Activity;
///creating parent class
public class Overridding {

	void run() {
		System.out.println("running mode on");

	}}
// creating child class
	class Testoverridding extends Overridding{
		// defining same name method as its declared in parents class
		void run() {
			System.out.println("running mode off");
		}
		public static void main (String args[]) {
			//creating a object of child class
			Testoverridding obj=new Testoverridding();
			obj.run();
		}
	}

