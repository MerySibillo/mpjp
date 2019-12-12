package s044;

public class Cercaelementi {
	public static void main(String[] args) {
		int[] array = { 5, 7, 1, 3, 4 }; // c'è 1 c'è 7 se si in che posizione? se non c'è print -1
		int onepos = -1;
		int sevenpos = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				onepos = i;
				break;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				sevenpos = i;
			}
		}
		System.out.println("1 is in position " + onepos);
		System.out.println("7 is in position " + sevenpos);
	}
}
