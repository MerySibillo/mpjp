package s075;

public class Main {
	public static void main(String[] args) {
		Poodle poodle = new Poodle("Jim");
		Poodle p2 = new Poodle();

		System.out.println(poodle);
		System.out.println(p2);

		Poodle poodle3 = new Poodle("Philip", 5, 12);
		System.out.println(poodle3);
	}
}
