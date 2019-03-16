package javaNotes;

public class JavaNotes {
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void reverse(int[] arr) {
		int front = 0;
		int back = arr.length - 1;
		
		while (front < back) {
			swap(arr, front, back);
			front++;
			back--;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {2, 6, 4, 8, 9};
		
		// Reverse an array
		reverse(arr);
		
		for (int element : arr) {
			System.out.print(element + " ");
		}

	}

}
