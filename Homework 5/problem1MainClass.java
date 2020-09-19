package problem1;

import java.util.ArrayList;
import java.util.Date;


public class MainClass {
	public static void main(String args[]) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add("Food");
		a.add("Orange");
		a.add("Fruit");
		a.add("Papaya");
		a.add(3932728);
		a.add("Apple");
		a.add("now");
		a.add("Food");
		a.add("sandwich");
		
		foodarray(a);
	}
	 
	public static ArrayList<Object> foodarray(ArrayList<Object> arr) {
		ArrayList<Object> foodlist = new ArrayList<Object>();
		for (int i=0; i<arr.size(); i++) {
			if (arr.get(i).getClass() == String.class) {
				if (arr.get(i).equals("Food")) {
					if (!"Food".equals(arr.get(i+1)) && !"Fruit".equals(arr.get(i+1)) 
							&& !"Orange".equals(arr.get(i+1)) && !"Apple".equals(arr.get(i+1))) {
						Food f = new Food(arr.get(i+1).toString());
						foodlist.add(f);
					}
					else {
						Food f = new Food();
						foodlist.add(f);
					}
				}
				if (arr.get(i).equals("Fruit") && !"Food".equals(arr.get(i+1))
						&& !"Orange".equals(arr.get(i+1)) && !"Apple".equals(arr.get(i+1))) {
					if (arr.get(i+1).getClass() == Integer.class && !"Food".equals(arr.get(i+2))
							&& !"Fruit".equals(arr.get(i+2)) && !"Orange".equals(arr.get(i+2))
							&& !"Apple".equals(arr.get(i+2))) {
						int intdate = (Integer)arr.get(i+1);
						Date d = new Date(intdate);
						Fruit fr = new Fruit(d,arr.get(i+2).toString());
						foodlist.add(fr);
					}
					else if (arr.get(i+2).getClass() == Integer.class && !"Food".equals(arr.get(i+1))
							&& !"Fruit".equals(arr.get(i+1)) && !"Orange".equals(arr.get(i+1))
							&& !"Apple".equals(arr.get(i+1))) {
						int intdate = (Integer)arr.get(i+2);
						Date d = new Date(intdate);
						Fruit fr = new Fruit(d,arr.get(i+1).toString());
						foodlist.add(fr);
					}
					else {
						Fruit fr = new Fruit();
						foodlist.add(fr);
					}
				}
				if (arr.get(i).equals("Orange")) {
					if (arr.get(i+1).getClass() == Integer.class)  {
						int intdate = (Integer)arr.get(i+1);
						Date d = new Date(intdate);
						Orange o = new Orange(d);
						foodlist.add(o);
					}
					else {
						Orange o = new Orange();
						foodlist.add(o);
					}
					
				}
				if (arr.get(i).equals("Apple")) {
					if (arr.get(i+1).getClass() == Integer.class)  {
						int intdate = (Integer)arr.get(i+1);
						Date d = new Date(intdate);
						Apple a = new Apple(d);
						foodlist.add(a);
					}
					else {
						Apple a = new Apple();
						foodlist.add(a);
					}
					
				}
			}
		}
		System.out.println(foodlist);
		return foodlist;
	}
}
