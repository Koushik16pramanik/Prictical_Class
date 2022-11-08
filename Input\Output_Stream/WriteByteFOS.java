package IO;
import java.io.FileOutputStream;

//write byte & String using FOS
public class WriteByteFOS {
	public static void main(String[] args) {
		try {
			// write Byte
			FileOutputStream f= new FileOutputStream("D:\\test.txt");  // destination
			f.write(67);
			f.close();
			System.out.println("done"); 
			//write String
		/*	String s= "Welcome to Anudip Foundation";
			byte b[] = s.getBytes();  // converting string into byte array
			f.write(b);
			f.close();
			System.out.println("done");  */
		}
		catch(Exception e) {
			System.out.println(e);
		}}}
