package String;
import java.util.regex.*;

public class RegexExample {
	public static void main(String[] args) {
		// on way to represent pattern 7 matcher
		Pattern p= Pattern.compile(".a"); // single dot represent single character
		// compile regular expression into pattern
		Matcher m= p.matcher("ma"); // .a dot represent single char m
		boolean b= m.matches(); // output for b// true
		// another way 
		boolean bb = Pattern.compile("..m").matcher("aam").matches(); // false/true output for bb // true
		
		// one more way
		boolean b1= Pattern.matches(".a", "sa");
		System.out.println(b+" "+bb+" "+b1);
		
		// character class ---
		//[abc]= a,b,c= a,b,c, [ ^abc]= any char expect abc [a-za-z]= either upper/ lower case and both 
		boolean b5 = Pattern.matches("[a-za-z]","A"); // true
		boolean b3 = Pattern.matches("[pqr]","pppqqqrrr");
		boolean b6 = Pattern.matches("[^abc]","Aab"); // false
		System.out.println(b5+" "+b6);
	
		// Quantifiers
		//x? - x  occur or not at all        x+ -- x occur once or more than one
		// x* -- x occur zero or more time    x{n} -- x occure n time x {7} only 7 char
		//  x{n, } -- x occure n or more time  {7,} only 7 char or more
		boolean b7 = Pattern.matches("[a-zA-Z0-9]|{8}", "Anudip123ppp"); // true
		
		// meta char --- /d = [0-9].         /s -- whilte space char, /w- [a-zA-Z-0-9]
		// match any phone number 
		boolean b2= Pattern.matches("[6789] {1} [0-9] {9}", "8348222888"); // {1} 1st digit of phone no {9} rest 9 digit
		// for email
		boolean b8= Pattern.matches("^[a-z0-9+_.-]*@[a-zA-Z0-9]*+\\.[a-z] {3}", "koushik123_.-@gmail.com");
		boolean b9= Pattern.matches("^[a-zA-Z0-9+, null)_.-] {8,}","Koushik@123_."); // false
		System.out.println(b9);
	}}