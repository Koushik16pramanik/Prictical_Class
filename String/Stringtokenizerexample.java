package String;
import java.util.*;

public class Stringtokenizerexample { // class

	public static void my() { // my method
			StringTokenizer t= new StringTokenizer("Anudip foundation skill and carrer development centre", " ");
			while(t.hasMoreTokens()) { // Boolean method is check if there is more token avilable or not
			System.out.println(t.nextToken(" "));  // string method it return the next token from string tokenizer obj
			StringTokenizer st =new StringTokenizer("I am Koushik, Staying in Medinipur");
			while(st.hasMoreTokens()) {
			System.out.println(st.nextToken(","));	
			}}}
	public static void main(String[] args) {
			my();
	}}