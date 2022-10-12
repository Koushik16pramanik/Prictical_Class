package String;

class StringExampl {
 public void show() {
	 char [] arr = { 'j','a','v','a'};
	 String s= new String(arr);
	 System.out.println("value is : " +s);
	 System.out.println(arr);
 }
 public void myFunction() {
	 String m= "Mou";
	 String m1= "Mou";
	 String m2= new String("Mou");
 }
 public static void main(String args[]) {
	StringExampl s= new StringExampl();
	s.show();
	s.myFunction();
 }}