package cis285.labs;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestSelectionSort {
    public TestSelectionSort() {}

    SelectionSort testSS = new SelectionSort();

    @Test
    public void testPositive(){
      int[] expectedSort = {2, 7, 8, 9, 10};
      int[] arr = {8, 9, 7, 10, 2};
      assertArrayEquals(expectedSort, testSS.basicSelectionSort(arr));
    }

    @Test
    public void testNegative(){
      int[] expectedSort = {-10, -9, -8, -7, -2};
      int[] arr = {-2, -7, -8, -9, -10};
      assertArrayEquals(expectedSort, testSS.basicSelectionSort(arr));
    }

    @Test
    public void testMixed(){
      int[] expectedSort = {-9, -7, 2, 8, 10};
      int[] arr = {2, -7, 8, -9, 10};
      assertArrayEquals(expectedSort, testSS.basicSelectionSort(arr));
    }

    @Test
    public void testDuplicates(){
      int[] expectedSort = {-9, -7, -7, 2, 8, 9, 10, 10};
      int[] arr = {2, -7, 8, -9, 10, -7, 9, 10};
      assertArrayEquals(expectedSort, testSS.basicSelectionSort(arr));
    }
}
