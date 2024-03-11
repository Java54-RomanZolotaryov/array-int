package telran.util.test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.util.ArraysInt.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTest {
	
	int[] array = {10, 25, 30, 40, 100};
	int[] emptyArray = {};

	@Test
	void addNumberTest() {
		int[] arrayExpected = {10, 25, 30, 40, 100, -2};
		int[] arrayActual = addNumber(array, -2);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	void insertNumberTest() {
		int[] arrayExpectedLast = {10, 25, 30, 40, 100, 25};
		int[] arrayExpectedFirst = {25, 10, 25, 30, 40, 100};
		int[] arrayExpectedMidle = {10, 25, 30, 25, 40, 100};
		
		int[] arrayActualLast = insertNumber(array, 5, 25);
		int[] arrayActualFirst = insertNumber(array, 0, 25);
		int[] arrayActualMidle = insertNumber(array, 3, 25);
		
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
		assertArrayEquals(arrayExpectedMidle, arrayActualMidle);
	}
	
	@Test
	void removeNumberTest() {
		int[] arrayExpectedLast = {10, 25, 30, 40};
		int[] arrayExpectedFirst = {25, 30, 40, 100};
		int[] arrayExpectedMidle = {10, 25, 40, 100};
		
		int[] arrayActualLast = removeNumber(array, array.length - 1);
		int[] arrayActualFirst = removeNumber(array, 0);
		int[] arrayActualMidle = removeNumber(array, 2);
		
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
		assertArrayEquals(arrayExpectedMidle, arrayActualMidle);
	}
	
	@Test
	void insertSortedTest() {
		int[] arrayExpectedLast = {10, 25, 30, 40, 100, 150};
		int[] arrayExpectedFirst = {10, 10, 25, 30, 40, 100};
		int[] arrayExpectedMidle = {10, 25, 30, 35, 40, 100};
		
		int[] arrayActualLast = insertSorted(array, 150);
		int[] arrayActualFirst = insertSorted(array, 10);
		int[] arrayActualMidle = insertSorted(array, 35);
		
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
		assertArrayEquals(arrayExpectedMidle, arrayActualMidle);
	}
	
	@Test
	void copyOfTest() {
		int[] arrayExpectedSameLength = {10, 25, 30, 40, 100};
		int[] arrayExpectedLessLength = {10, 25, 30};
		int[] arrayExpectedGreaterLength = {10, 25, 30, 40, 100, 0};
		
		int[] arrayActualSameLength = Arrays.copyOf(array, array.length);
		int[] arrayActualLessLength = Arrays.copyOf(array, array.length - 2);
		int[] arrayActualGreaterLength = Arrays.copyOf(array, array.length + 1);
	
		assertArrayEquals(arrayExpectedSameLength, arrayActualSameLength);
		assertArrayEquals(arrayExpectedLessLength, arrayActualLessLength);
		assertArrayEquals(arrayExpectedGreaterLength, arrayActualGreaterLength);
	}
	
	@Test
	void arraycopyTest() {
		int[] array1 = {3, 10, 20, 15};
		int[] expected1 = {10, 25, 10, 20, 100};
		int[] actual1 = Arrays.copyOf(array, array.length);
		System.arraycopy(array1, 1, actual1, 2, 2);
		assertArrayEquals(expected1, actual1);
	}
	
	@Test
	void binarySearchIntTest() {
		//TODO
	}

}
