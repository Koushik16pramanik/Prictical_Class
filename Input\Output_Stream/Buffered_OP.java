package IO;
import java.io.*;
// Buffered output string
public class Buffered_OP {
	public static void main(String[] args) {
		try {
			// write Byte
			FileOutputStream f= new FileOutputStream("D:\\test5.txt");  // destination
			BufferedOutputStream bs= new BufferedOutputStream(f);
		String s= "I Love Coading";
		byte b[] = s.getBytes();
		f.write(b);
		f.close();
		System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
	}}}
