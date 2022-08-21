package Oerateor;

public class Nestedifeg {

	public static void main(String[] args) {
		String address = "Kolkata , India" ;
		if(address.endsWith("India")) {
		if(address.contains("Garhbeta")) {
		System.out.println("Your city is Garhbeta");
		}else if(address.contains("Medinipur")) {
		System.out.println("Your city is Medinipur");
		}else {
		System.out.println(address.split(",")[1]);
		}
		}else {
			System.out.println("You are not living in India");
		}

	}

}
