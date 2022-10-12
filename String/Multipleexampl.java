package String;
//append insert replace delete reverse- multiple class ( String builder & Buffer )
public class Multipleexampl {

	public static void my() {
		StringBuffer s= new StringBuffer("Hello");
		s.append("World");
		System.out.println("String is : " + s);
		s.insert(2, "Rick"); //(int off set, String s) // hericklloworld
		System.out.println("insert is : " + s);
		s.replace(1, 3, "java"); // (begnwith, endwith, string s)
		System.out.println("replace is : " + s); // hericklloworld
		System.out.println("capacity is : " + s.capacity() );
		StringBuilder s1= new StringBuilder("World");
		s1.replace(1, 3, "java");
		// w o r l d   1 = 0  3 = 1 wjavald
		System.out.println("replace is : " + s1);
		s1.delete(1, 3);  // w j a v a l d 1=j  3=v wvald
		System.out.println("deleate is : " + s1);
		s1.reverse(); // dlavw
		System.out.println("reserve is : "+ s1);
	}
	public static void main(String[] args) {
	my();
	}}