package s044;

public class loop3 {
	public static void main(String[] args) {
		int data[] = { 5, 7, 1, 3, 4 };

		System.out.print("[");
		for (int item : data) {
			System.out.print(item);
				System.out.print(",");
		}
		System.out.print("]");
	}
}
