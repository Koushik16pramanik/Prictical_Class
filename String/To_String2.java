package String;
//represent any object to string
public class To_String2 {
	
	int rollno; //integer type variable
	String name,addr; // String
	To_String2 (int rollno,String name,String addr){
	this.rollno = rollno;
	this.name = name;
	this.addr = addr;
	}
	public String toString() {
		return rollno+" "+name+" "+addr; //return object to string
	}
	public static void main(String[] args) {
		To_String2 s1= new To_String2 (1,"Rick","Delhi"); // return the hashcode value of to string
		To_String2 s2= new To_String2 (2, "Mou","Kolkata");
		
		System.out.println(s1); // compile write s1.tostring()
		System.out.println(s2);
	}}