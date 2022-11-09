package IO;
import java.io.*;
 // File Reader Example
public class FileReaderExample {
	public static void main(String[] args) {
		try {
			FileReader fr= new FileReader("D:/test5.txt");
			int i;
			while ((i = fr.read())!=-1) {
				System.out.println((char)i);
			}
			fr.close();
			System.out.println("done");
		}
		catch (Exception e) {
			System.out.println(e);
		}}}
