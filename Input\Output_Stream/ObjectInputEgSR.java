package IO;
import java.io.*;

// object input stream --- deserialization (byte stream to object)
 class Student implements Serializable {
	 int id;
	 String sname;
	 int fees;
	 public Student (int id, String sname, int fees)  {
		 this.id= id;
		 this.sname= sname;
		 this.fees= fees;
	 }}
 public class ObjectInputEgSR {
	public static void main(String[] args) {
		try {
			ObjectInputStream oi= new ObjectInputStream (new FileInputStream("D://ab.txt"));
			Student s= (Student) oi.readObject();
			System.out.println("id is :"+ s.id+" "+ "name is" +" "+ s.sname+" "+"fees is :"+s.fees);
			oi.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}}}
