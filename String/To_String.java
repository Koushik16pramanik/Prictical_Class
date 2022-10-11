package String;
// represent any object to string
public class To_String {
	
	int rollno; //integer type variable
	String name,addr; // String
	To_String (int rollno,String name,String addr){
	this.rollno = rollno;
	this.name = name;
	this.addr = addr;
	}
	public static void main(String[] args) {
		To_String s1= new To_String (1,"Rick","Medinipur"); // return the hashcode value of to string
		To_String s2= new To_String (2, "Mou","Kolkata");
		System.out.println(s1); // compile write s1.tostring()
		System.out.println(s2);
	}}