package ExceptionHandling;
// under the throwable class user defined exception
class UserDefineException1 extends Exception {  // parent exception class
	public UserDefineException1(String str) {
		super (str); // call the cons
	}}
public class UserDefineException {
	public static void main(String[] args) {
		try {
			throw new UserDefineException1 ("User defined exception");
		}
		catch (UserDefineException1 u) {
			System.out.println("exception dhora poreche");
			System.out.println(u.getMessage());
		}}}