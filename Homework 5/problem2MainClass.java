package problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;


public class MainClass {
	public static void main(String args[]) {
		ArrayList<Fruit> arr = new ArrayList<Fruit>();
		Fruit a = new Fruit(new Date(2000000000), "apple");
		Fruit b = new Fruit(new Date(350000213), "banana");
		Fruit c = new Fruit(new Date(0), "cherry");
		Fruit d = new Fruit(new Date(736000000), "durian");
		Fruit e = new Fruit(new Date(50000000), "elderberry");
		Fruit f = new Fruit(new Date(999999999), "fig");
		arr.add(a);
		arr.add(b);
		arr.add(c);
		arr.add(d);
		arr.add(e);
		arr.add(f);
		
		sortByDate(arr);
	}
	
	public static void sortByDate(ArrayList<Fruit> arr) {
		System.out.println("Unsorted fruit list: ");
		for (Fruit f : arr) {
			System.out.println("Name: " + f.name + " ");
			System.out.println("\tRipe Date: " + f.ripe);
		}
		System.out.println("\n");
		Collections.sort(arr);
		System.out.println("Sorted fruit list (Earliest to latest ripe date): ");
		for (Fruit f : arr) {
			System.out.println("Name: " + f.name + " ");
			System.out.println("\tRipe Date: " + f.ripe);
		}
	}

}
