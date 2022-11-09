package IO;
import java.io.FileInputStream;

//write byte & String using File Input Stream
public class WriteByteFIS {
	public static void main(String[] args) {
		try {
			// write Byte
			FileInputStream f= new FileInputStream("D:\\text2.txt");  // destination
		/*	int i = f.read();
			System.out.println((char)i);  // convert it into character
			f.close();  */
			// read all character
			int i= 0;
			while ((i=f.read()) !=-1) {
				System.out.println((char)i);  // convert in into character
			}
			f.close();  
		}
		catch(Exception e) {
			System.out.println(e);
		}}}
