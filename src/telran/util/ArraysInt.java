package telran.util;

import java.util.Arrays;

public class ArraysInt {
	
	public static int[] addNumber(int[] array, int number) {
		int[] extendedOriginal = Arrays.copyOf(array, array.length + 1);
		extendedOriginal[array.length] = number;
		return extendedOriginal;
	}
	
	public static int[] insertNumber(int[] array, int index, int number) {
		int[] newArray = null;
		if (index == array.length) { // add element to the end
			newArray = addNumber(array, number);
		} else {
			newArray = new int[array.length + 1];
			newArray[index] = number;
			commonCopy(array, newArray, index, false);
		}
		return newArray;
	}
	
	public static int[] removeNumber(int[] array, int index) {
		int[] newArray = null;
		if (index == array.length - 1) { // remove last element
			newArray = Arrays.copyOf(array, array.length - 1);
		} else {
			newArray = new int[array.length - 1];
			commonCopy(array, newArray, index, true);
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

	private static void commonCopy(int[] source, int[] target, int index, boolean isRemoveOperation) {
		if (index != 0) {
			System.arraycopy(source, 0, target, 0, index);
		}
		int sourceIndex = isRemoveOperation ? index + 1 : index;
		int targetIndex = isRemoveOperation ? index : index + 1;
		int elementsToCopy = isRemoveOperation ? source.length - index - 1 : source.length - index;
		System.arraycopy(source, sourceIndex, target, targetIndex , elementsToCopy);
	}

}