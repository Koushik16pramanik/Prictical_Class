package Collection;
import java.util.*;

public class ArrayListCompareEg {
public static void main(String[] args) {
List<String> al= new ArrayList<String>(); // Creating array list
al.add(0,"Lily");
al.add("Tulip");
al.add("Marigold");
al.add("Daisy");
al.add("Orchid");
al.add("Jasmine");
al.add("Lotus");
al.add(5,"Lavender");
System.out.println(al);
List<String> all= new ArrayList<String>();  // list 2
all.add("Rose");
all.add(0,"Lily");
all.add("Tulip");
all.add("Marigold");
all.add("Daisy");
all.add("Orchid");
all.add("Jasmine");
all.add("Lotus");
all.add(5,"Lavender");
System.out.println(all);
// compare array list
boolean b= al.equals(all);
System.out.println(b);
all.add("Red Rose");  // add new element
boolean b1 = al.equals(all);
System.out.println(b1);
	}}
