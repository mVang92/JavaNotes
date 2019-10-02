package javaNotes;

import java.util.ArrayList;

public class JavaNotes {
	
	static Swap swap = new Swap();
	
	public static ArrayList<Integer> reverseArrayWithoutSwap(int[] array) {
		ArrayList<Integer> newArray = new ArrayList<>();
		int rear = array.length - 1;
		for (int currentIndex = rear; currentIndex >= 0; currentIndex--) {
			newArray.add(array[currentIndex]);
		}
		return newArray;
	}
	
	public static ArrayList<Integer> compareTriplets(int[] alice, int[] bob) {
		ArrayList<Integer> answer = new ArrayList<>();
		final int LENGTH = 3;
		int bobPoints = 0;
		int alicePoints = 0;
		
		for (int i = 0; i < LENGTH; i++) {
			if (alice[i] < bob[i]) {
				bobPoints++;
			}
			if (alice[i] > bob[i]) {
				alicePoints++;
			}
		}
		
		answer.add(alicePoints);
		answer.add(bobPoints);
		
		return answer;
	}
	
	public static int simpleSumArray(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
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
	
	public static int diagonalDifference(int[][] arr) {
		int leftSum = 0;
		int rightSum = 0;
		int rear = arr.length - 1;
		int difference;
		
		for (int i = 0; i < arr.length; i++) {
			leftSum += arr[i][i];
			rightSum += arr[i][rear--];
		}
		difference = rightSum - leftSum;
		
		return difference;
		
	}
	
	public static void doubleMoney(int days, int currentDay, int totalDollars) {
		System.out.println("Day " + currentDay + ": " + totalDollars);
		if (currentDay < days) {
			currentDay++;
			totalDollars *= 2;
			doubleMoney(days, currentDay, totalDollars);
		}
	}
	
	public static void saveToBeMillionaire() {
		final int DOLLAR_AMOUNT = 5;
		final int GOAL = 1000000;
		final int DAYS_IN_YEAR = 365;
		final int MONTH_IN_YEAR = 12;
		
		int days = GOAL/DOLLAR_AMOUNT;
		int months = days/DAYS_IN_YEAR;
		int years = months/MONTH_IN_YEAR;
		System.out.println("It will take " + years +" year(s) or " + months + " month(s) or " + days + " day(s) to reach " + GOAL + " dollars.");
		
	}

	public static void main(String[] args) {
		
		int[] arr1 = {2, 6, 4, 8, 9};
		int[] arr2 = {6, 0, 9, 0, 0, 2, 0, 4};
		int[] alice = {5, 3, 4};
		int[] bob = {3, 2, 6};
		int[][] diagDiff = {{3, 4, 5},{4, 9, 1},{8, 6, 1}};
		int days = 31;
		int currentDay = 1;
		int totalDollars = 1;
		
//		Reverse an array -----------------------------
//		reverse(arr1);
//		swap.printRes(arr1);
		
//		Reverse an array without swap method
		System.out.println(reverseArrayWithoutSwap(arr1));
		
//		Move all zeros to the end of array -----------
//		moveZeros(arr2);
//		Swap.printRes(arr2);
		
//		Simple Sum Array -----------------------------
//		System.out.println(simpleSumArray(arr1));
		
//		Compare the Triplets -------------------------
//		System.out.println(compareTriplets(alice, bob));
		
//		Diagonal Difference
//		System.out.println(diagonalDifference(diagDiff));
		
//		Double your dollar each day for a month
//		doubleMoney(days, currentDay, totalDollars);
		
//		How long before I become a millionaire
//		saveToBeMillionaire();
		
	}

}
