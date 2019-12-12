package s044;

public class Compito {
	public static void main(String[] args) {
		int[] array = { 59, 20, 33, 14, 36, 44, 5, 23 };
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min);
	}
}
