package IO;
import java.io.*;
 // File Writer output stream Example
public class FileWriterExample {
	public static void main(String[] args) {
		try {
			FileWriter fw= new FileWriter ("D://test6.txt");  
			fw.write("Welcome to Anudip Foundation");
			fw.close();
		}
		catch (Exception e) {
			System.out.println(e);
		} 
		System.out.println("Done");
		}}
