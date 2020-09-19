package problem1;

public class Food {
	public String name;
	public Food() {
		name = "";
	}
	public Food(String n) {
		name = n;
	}
	public void prepare() {
		System.out.println("Prepare the "+name);
	}
	@Override
	public String toString() {
		return ("Food");
	}
}
