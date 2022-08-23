package Oerateor;

public class Switcheg {

	public static void main(String[] args) {
		int day=7;
		String daystring="";
		switch (day) {
		case 1: daystring="1-sunday";
		break;
		case 2: daystring="1-monday";
		break;
		case 3: daystring="1-tuesday";
		break;
		case 4: daystring="1-wednusday";
		break;
		case 5: daystring="1-thrusday";
		break;
		case 6: daystring="1-friday";
		break;
		case 7: daystring="1-saturday";
		break;
		default : System.out.println("Invalid day");
		}
		System.out.println(daystring);
		
	}

}


