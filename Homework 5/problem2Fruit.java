package problem2;

import java.util.Date;

public class Fruit extends Food implements Comparable<Fruit>{
	public Date ripe;
	public Fruit() {
		name = "";
		ripe = new Date(0);
	}
	public Fruit(Date r, String n) {
		ripe = r;
		name = n;
	}
	public void ripeTime() {
		System.out.println("You can eat it on " +ripe);
	}
	@Override
	public String toString() {
		return ("Name:" + name);
	}
	public int compareTo(Fruit f) {
		if (ripe.compareTo(f.ripe) == 0) {
			return 0;
		}
		else if (ripe.compareTo(f.ripe) > 0) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
