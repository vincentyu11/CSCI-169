package problem1;

import java.util.Date;

public class Fruit extends Food {
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
		return ("Fruit");
	}
}
