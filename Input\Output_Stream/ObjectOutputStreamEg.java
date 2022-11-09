package IO;
import java.io.*;

// Object Output Stream
 class Student implements Serializable {    // Serializable interface
	int id;
	String name;
	transient int fees;   // used it with data members of class in order to avoid serialization
	public Student ( int id, String name, int fees) {
		this.id= id;
		this.name= name;
		this.fees= fees;
	}}
 
public class ObjectOutputStreamEg {
	public static void main(String[] args) {
	try {
		Student s= new Student (101,"Koushik", 2000);  // s is object of studennt class
		FileOutputStream fout= new FileOutputStream("D://ab.txt");  // write in file
		ObjectOutputStream obj= new ObjectOutputStream(fout);
		obj.writeObject(s);
		obj.close();
		System.out.println("done");
	}
	catch (Exception e) {
		System.out.println(e);
	}}}
