package Activity;

class AddressHasA {
	String state,country,city,area;
	AddressHasA(String city,String state,String country ,String area ){
		this.city=city;
		this.state=state;
		this.country=country;
		this.area=area;
	}
}

public class StudenthasA {
int id;
String name;
AddressHasA address;   //Aggregation
public StudenthasA(int id,String name,AddressHasA address) {
	this.id=id;
	this.name=name;
	this.address=address;
}
void show() {
	System.out.println(id+"    "+name);
	System.out.println(address.city+"  "+address.state+"  "+address.country+"  "+address.area);
}
	public static void main(String[] args) {
		
		AddressHasA obj1= new AddressHasA("AAA","ABC","ACD","ADE");
		StudenthasA obj2=new StudenthasA(420,"Rick",obj1);
		obj2.show();


	}

}
