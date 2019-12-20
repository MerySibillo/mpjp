package s077;

public class Exercise {
	public static void main(String[] args) {
		Pet[] pets = { new Dog("Pinco"), new Dog("Bauu"), new Dog("Otto"), new Cat("Palla") };

		for (Pet pet : pets) {
			if (pet instanceof Dog) {
				Dog dog = (Dog) pet;
				dog.bark();
			} else if (pet instanceof Cat) {
				((Cat) pet).meow();
			} else {
				System.out.println("Unknown pet");
			}
		}
	}

}
