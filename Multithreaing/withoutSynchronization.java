package Multithreaing;
 // without using synchronization 
 class MyThreadclass {
  void print (int num) {  // without sync
	  for(int i=1; i<=5; i++) {
		  System.out.println(num*i);
		  try {
			  Thread.sleep(500);
		  }
		  catch (Exception e) {
			  System.out.println(e);
		  }}}}
 class Thread1 extends Thread {
	 MyThreadclass ws;
	 Thread1 (MyThreadclass ws) {
		 this.ws=ws;
	 }
	 public void run () {
		 ws.print(5);}}  // 5*1  5*2  5*3  5*4  5*5
 class Thread2 extends Thread{
	 MyThreadclass ws;
	 Thread2 (MyThreadclass ws) {
		 this.ws=ws;
	 }
	 public void run () {
		 ws.print(500);}}  // 500*1  500*2.......
 class withoutSynchronization {
	 public static void main (String[] args) {
		 MyThreadclass obj = new  MyThreadclass();
		 Thread1 t1 = new Thread1 (obj);
		 Thread2 t2 = new Thread2 (obj);
		 t1.start();
		 t2.start();
	 }}