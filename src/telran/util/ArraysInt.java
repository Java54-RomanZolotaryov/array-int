package telran.util;

import java.util.Arrays;

public class ArraysInt {
	
	public static int[] addNumber(int[] array, int number) {
		int[] extendedOriginal = Arrays.copyOf(array, array.length + 1);
		extendedOriginal[array.length] = number;
		return extendedOriginal;
	}
	
	public static int[] insertNumber(int[] array, int index, int number) {
		int[] newArray = array;
		if (index > -1 && index <= array.length) {
			newArray = new int[array.length + 1];
			System.arraycopy(array, 0, newArray, 0, index);
			System.arraycopy(array, index, newArray, index + 1, array.length - index);
			newArray[index] = number;
		}
		return newArray;
	}
	
	public static int[] removeNumber(int[] array, int index) {
		int[] newArray = array;
		if (index > -1 && index < array.length) {
			newArray = new int[array.length - 1];
			System.arraycopy(array, 0, newArray, 0, index);
			System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
		}
		return newArray;
	}
	
	public static int[] insertSorted(int[] sortedArray, int number) {
		int insertionIndex = applyBitwiseComplementIfNegative((Arrays.binarySearch(sortedArray, number)));
		return insertNumber(sortedArray, insertionIndex, number);
	}

	private static int applyBitwiseComplementIfNegative(int value) {
		return value < 0 ? (~ value) : value;
	}
}