package javaNotes;

public class Swap {
	
	public static void swapElements(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void printRes(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
	}
}
