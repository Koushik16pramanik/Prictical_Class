package ExceptionHandling;

//Different types of Exception
 class ExceptionExample {
	public void show() {
		String a= "i am error";
		System.out.println(a);
		try {
	int i= 50/0;  // arithmetic exception
 	System.out.println(i);  
	String a1= "riya";
	System.out.println(a.length());
	int arr[]= new int[3];
 	arr[4]= 24;  // array index out of bound exception

	int m= Integer.parseInt(a); // number format exception
	System.out.println(m);
	}
	catch (Exception f)	{
		System.out.println(f);
	}
		String b= "i cannot be handle";
		System.out.println(a+b);
	}
	public static void main(String...args) {
		ExceptionExample ep= new ExceptionExample();
		ep.show();
	}}