package Oerateor;

interface Printable{  
void print();  
}  
interface Showable{  
void print();//void show();  
}  
class DemoClass implements Printable,Showable{  
public void print() {
    System.out.println("Hello");
}  
/*public void show(){
	System.out.println("Welcome");
*/	
  
public static void main(String args[]){  
	DemoClass obj = new DemoClass();  
obj.print();  
//obj.show();  
 }}