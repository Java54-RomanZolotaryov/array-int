package telran.util.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static telran.util.ArraysInt.addNumber;
import static telran.util.ArraysInt.insertNumber;
import static telran.util.ArraysInt.insertSorted;
import static telran.util.ArraysInt.removeNumber;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "Test case for functionality of ArraysInt/Arrays classes")
class ArraysTest {
	
	int[] array = {10, 25, 30, 40, 100};
	int[] emptyArray = {};

	@Test
	@DisplayName(value = "Test addNumber(arr:{10, 25, 30, 40, 100}, value:-2), result {10, 25, 30, 40, 100, < -2>}")
	void testAddNumber_WhenArrayIsNotEmptyAndValueIsMinusTwo_ReceiveNewArrayWithCopiedElementsAndAddedMinusTwoByLastIndex() {
		int[] arrayExpected = {10, 25, 30, 40, 100, -2};
		int[] arrayActual = addNumber(array, -2);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test addNumber(arr:{}, value:5), result {<5>}")
	void testAddNumber_WhenArrayIsEmptyAndValueIsFive_ReceiveNewArrayWithFiveAddedByLastIndex() {
		int[] arrayExpected = { 5 };
		int[] arrayActual = addNumber(emptyArray, 5);
		assertArrayEquals(arrayExpected, arrayActual);
	}

	@Test
	@DisplayName(value = "Test insertNumber(arr:{10, 25, 30, 40, 100}, index:5, value:25), result {10, 25, 30, 40, 100, <25>}")
	void testInsertNumber_WhenArrayIsNotEmptyValueIsTwentyFiveAndIndexIsFive_ReceiveNewArrayWithCopiedElementsAndAddedTwentyFiveByIndexFive() {
		int[] arrayExpected = {10, 25, 30, 40, 100, 25};
		int[] arrayActual = insertNumber(array, 5, 25);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test insertNumber(arr:{10, 25, 30, 40, 100}, index:0, value:25), result {<25>, 10, 25, 30, 40, 100}")
	void testInsertNumber_WhenArrayIsNotEmptyValueIsTwentyFiveAndIndexIsZero_ReceiveNewArrayWithCopiedElementsAndAddedTwentyFiveByIndexZero() {
		int[] arrayExpected = {25, 10, 25, 30, 40, 100};
		int[] arrayActual = insertNumber(array, 0, 25);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test insertNumber(arr:{10, 25, 30, 40, 100}, index:3, value:25), result {10, 25, 30, <25>, 40, 100}")
	void testInsertNumber_WhenArrayIsNotEmptyWhenValueIsTwentyFiveAndIndexIsThree_ReceiveNewArrayWithCopiedElementsAndAddedTwentyFiveByIndexThree() {
		int[] arrayExpected = {25, 10, 25, 30, 40, 100};
		int[] arrayActual = insertNumber(array, 0, 25);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test insertNumber(arr:{10, 25, 30, 40, 100}, index:3, value:25), result {10, 25, 30, <25>, 40, 100}")
	void testInsertNumber_WhenArrayIsNotEmptyValueIsTwentyFiveAndIndexIsThree_ReceiveNewArrayWithCopiedElementsAndAddedTwentyFiveByIndexThree() {
		int[] arrayExpected = {25, 10, 25, 30, 40, 100};
		int[] arrayActual = insertNumber(array, 0, 25);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test insertNumber(arr:{}, index:0, value:25), result {<25>}")
	void testInsertNumber_WhenArrayIsEmptyValueIsTwentyFiveAndIndexIsZero_ReceiveNewArrayWithAddedTwentyFiveByIndexZero() {
		int[] arrayExpected = { 25 };
		int[] arrayActual = insertNumber(emptyArray, 0, 25);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test removeNumber(arr:{10, 25, 30, 40, 100}, index:0), result {25, 30, 40, 100}")
	void testRemoveNumber_WhenArrayIsNotEmptyAndIndexIsZero_ReceiveNewArrayWithoutFirstElementTen() {
		int[] arrayExpected = {25, 30, 40, 100};
		int[] arrayActual = removeNumber(array, 0);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test removeNumber(arr:{10, 25, 30, 40, 100}, index:4), result {10, 25, 30, 40}")
	void testRemoveNumber_WhenArrayIsNotEmptyAndIndexIsFour_ReceiveNewArrayWithoutLastElementHundred() {
		int[] arrayExpected = {10, 25, 30, 40};
		int[] arrayActual = removeNumber(array, 4);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test removeNumber(arr:{10, 25, 30, 40, 100}, index:2), result {10, 25, 40, 100}")
	void testRemoveNumber_WhenArrayIsNotEmptyAndIndexIsTwo_ReceiveNewArrayWithoutElementThirty() {
		int[] arrayExpected = {10, 25, 40, 100};
		int[] arrayActual = removeNumber(array, 2);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test insertSorted(arr:{10, 25, 30, 40, 100}, value:10), result {<10>, 10, 25, 30, 40, 100}")
	void testInsertSorted_WhenArrayIsNotEmptyAndSortedAndValueIsTen_ReceiveNewArrayWithOriginalElementsAndOrderWithAddedTenAsFirstElement() {
		int[] arrayExpected = {10, 10, 25, 30, 40, 100};
		int[] arrayActual = insertSorted(array, 10);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test insertSorted(arr:{10, 25, 30, 40, 100}, value:150), result {10, 25, 30, 40, 100, <150>}")
	void testInsertSorted_WhenArrayIsNotEmptyAndSortedAndValueIsHundredFifty_ReceiveNewArrayWithOriginalElementsAndOrderWithAddedHundredFiftyAsLastElement() {
		int[] arrayExpected = {10, 25, 30, 40, 100, 150};
		int[] arrayActual = insertSorted(array, 150);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test insertSorted(arr:{10, 25, 30, 40, 100}, value:35), result {10, 25, 30, <35>, 40, 100}")
	void testInsertSorted_WhenArrayIsNotEmptyAndSortedAndValueIsThirtyFive_ReceiveNewArrayWithOriginalElementsAndOrderWithAddedThirtyFiveByIndexThree() {
		int[] arrayExpected = {10, 25, 30, 35, 40, 100};
		int[] arrayActual = insertSorted(array, 35);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test insertSorted(arr:{}, value:35), result {<35>}")
	void testInsertSorted_WhenArrayIsEmptyAndValueIsThirtyFive_ReceiveNewArrayWithAddedThirtyFiveByIndexZero() {
		int[] arrayExpected = { 35 };
		int[] arrayActual = insertSorted(emptyArray, 35);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test Arrays.copyOf(arr:{10, 25, 30, 40, 100}, value:5), result {10, 25, 30, 40, 100}")
	void testArraysCopyOf_WhenArrayIsNotEmptyAndValueIsFive_ReceiveNewArrayWithFirstFiveElementsFromOriginal() {
		int[] arrayExpected = {10, 25, 30, 40, 100};
		int[] arrayActual = Arrays.copyOf(array, 5);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test Arrays.copyOf(arr:{10, 25, 30, 40, 100}, value:3), result {10, 25, 30}")
	void testArraysCopyOf_WhenArrayIsNotEmptyAndValueIsThree_ReceiveNewArrayWithFirstThreeElementsFromOriginal() {
		int[] arrayExpected = {10, 25, 30};
		int[] arrayActual = Arrays.copyOf(array, 3);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test Arrays.copyOf(arr:{10, 25, 30, 40, 100}, value:6), result {10, 25, 30, 40, 100, 0}")
	void testArraysCopyOf_WhenArrayIsNotEmptyAndValueIsSix_ReceiveNewArrayWithFirstFiveElementsFromOriginalAndAditionalValueZero() {
		int[] arrayExpected = {10, 25, 30, 40, 100, 0};
		int[] arrayActual = Arrays.copyOf(array, 6);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test Arrays.copyOf(arr:{}, value:2), result {0, 0}")
	void testArraysCopyOf_WhenArrayIsEmptyAndValueIsTwo_ReceiveNewArrayWithTwoElementsEachOfThemHasValueZero() {
		int[] arrayExpected = {0, 0};
		int[] arrayActual = Arrays.copyOf(emptyArray, 2);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	@DisplayName(value = "Test System.arrayCopy(source:{3, 10, 20, 15}, sIndex: 1, target:{10, 25, 30, 40, 100}, tIndex: 2, elements: 2), result {10, 25, <10>, <20>, 100}")
	void testSystemArrayCopy_WhinGivenTwoArraysSourceIndexIsOneTargerIndexIsTwoElementsToCopyIsTwo_TargetArrayWillContainTwoSourceElementsStartingFromIndexTwoOverWritten() {
		int[] source = {3, 10, 20, 15};
		int[] expected = {10, 25, 10, 20, 100};
		int[] target = Arrays.copyOf(array, array.length);
		System.arraycopy(source, 1, target, 2, 2);
		assertArrayEquals(expected, target);
	}
	
	@Test
	@DisplayName(value = "Test Arrays.binarySearch(arr:{10, 25, 30, 40, 100}, value:7), result -1")
	void testArraysBinarySearch_WhenArrayIsEmptyAndValueIsSeven_ReturnsValueMinusOne() {
		assertEquals(-1, Arrays.binarySearch(emptyArray, 7));
	}
	
	@Test
	@DisplayName(value = "Test Arrays.binarySearch(arr:{10, 25, 30, 40, 100}, value:-5), result -1")
	void testArraysBinarySearch_WhenArrayIsNotEmptyAndValueIsMinusFive_ReturnsValueMinusOne() {
		assertEquals(-1, Arrays.binarySearch(array, -5));
	}
	
	@Test
	@DisplayName(value = "Test Arrays.binarySearch(arr:{10, 25, 30, 40, 100}, value:27), result -3")
	void testArraysBinarySearch_WhenArrayIsNotEmptyAndValueIsTwentySeven_ReturnsValueMinusThree() {
		assertEquals(-3, Arrays.binarySearch(array, 27));
	}
	
	@Test
	@DisplayName(value = "Test Arrays.binarySearch(arr:{10, 25, 30, 40, 100}, value:150), result -6")
	void testArraysBinarySearch_WhenArrayIsNotEmptyAndValueIsHundredFifty_ReturnsValueMinusSix() {
		assertEquals(-6, Arrays.binarySearch(array, 150));
	}
	
	@Test
	@DisplayName(value = "Test Arrays.binarySearch(arr:{10, 25, 30, 40, 100}, value:100), result 4")
	void testArraysBinarySearch_WhenArrayIsNotEmptyAndValueIsHundred_ReturnsValueFour() {
		assertEquals(4, Arrays.binarySearch(array, 100));
	}
}
