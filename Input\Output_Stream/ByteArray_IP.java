package IO;
import java.io.*;

public class ByteArray_IP {
	public static void main(String[] args) {
	byte[]array = {66,67,68,69,70};
	ByteArrayInputStream bis= new ByteArrayInputStream (array);
	int i= 0;
	while ((i= bis.read())!=-1) {
		char c= ((char)i);
		System.out.println("ASCTI character :"+i+" , "+"value is : " +c);
	}}}
