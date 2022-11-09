package IO;
import java.io.*;
// Byte Array Output Stream
public class ByteArray_OP {
	public static void main(String[] args) {
		try {
			FileOutputStream f= new FileOutputStream("D:\\test.txt");
			FileOutputStream f1= new FileOutputStream("G:\\test.txt");
			ByteArrayOutputStream bos= new ByteArrayOutputStream();
			bos.write(65);
			bos.writeTo(f);
			bos.writeTo(f1);
			bos.close();
			System.out.println("done");
	}
		catch(Exception e) {
			System.out.println(e);
		}}}
