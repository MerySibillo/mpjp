package kata;

public class Arrayplusarray {
	public static int arrayPlusArray(int[] arr1, int[] arr2) {
		int cur1 = 0;

		for (int i = 0; i < arr1.length; i++) {
			cur1 = cur1 + arr1[i];
		}
		int cur2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			cur2 = cur2 + arr2[i];
		}
		return cur1 + cur2;
	}
}
