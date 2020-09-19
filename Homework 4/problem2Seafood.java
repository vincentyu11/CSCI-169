package problem2;

public class Seafood extends Food {
	public Seafood() {
		name = "";
	}
	public Seafood(String _name) {
		super(_name);
	}
	public void prepare() {
		System.out.println("Peel the "+name);
	}
}
