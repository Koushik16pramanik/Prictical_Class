package Oerateor;
    //Interface declaration: by first user  
	
interface Interface2 {  
	void draw();  
	}  
    //Implementation: by second user  

class Rectangle implements Interface2 {  
	public void draw(){System.out.println("drawing rectangle");}  
	}  
	class Circle implements Interface2 {  
	public void draw(){System.out.println("drawing circle");}  
	}  
	//Using interface: by third user  

	class TestInterface1{  
	public static void main(String args[]){  
	Interface2  d=new Circle(); 
	d.draw();  
	}}