package javaNotes;

public class JavaNotes {
	
	static Swap swap = new Swap();
	
	public static void moveZeros(int[] arr) {
		int currentIndex = 0;
		
		for (int letterIndex = 0; letterIndex < arr.length; letterIndex++) {
			int letter = arr[letterIndex];
			if (letter != 0) {
				Swap.swapElements(arr, currentIndex, letterIndex);
				currentIndex++;
			}
		}
	}
	
	public static void reverse(int[] arr) {
		int front = 0;
		int back = arr.length - 1;
		
		while (front < back) {
			Swap.swapElements(arr, front, back);
			front++;
			back--;
		}
	}

	public static void main(String[] args) {
		
		int[] arr1 = {2, 6, 4, 8, 9};
		int[] arr2 = {6, 0, 9, 0, 0, 2, 0, 4};
		
//		Reverse an array -----------------------------
//		reverse(arr1);
//		swap.printRes(arr1);
		
//		Move all zeros to the end of array -----------
//		moveZeros(arr2);
//		Swap.printRes(arr2);
		
	}

}
