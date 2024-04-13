package selectionsort;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    	
    }
    
    public void testPositive() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {8, 9, 7, 10, 2};
        int[] sortedArr = {2, 7, 8, 9, 10};
        selectionSort.basicSelectionSort(arr);
        assertArrayEquals("Positive numbers should be sorted", sortedArr, arr);
    }
       

    public void testNegative() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {-8, -9, -7, -10, -2};
        int[] sortedArr = {-10, -9, -8, -7, -2};
        selectionSort.basicSelectionSort(arr);
        assertArrayEquals("Negative numbers should be sorted", sortedArr, arr);
    }

    public void testMixed() {
        int[] arr = {3, -1, 0, -5, 2};
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        int[] Sortedarr = {-5, -1, 0, 2, 3};
        assertArrayEquals(Sortedarr, arr);
    }

    public void testDuplicates() {
        int[] arr = {2, 5, 2, 8, 5};
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        int[] Sortedarr = {2, 2, 5, 5, 8};
        assertArrayEquals(Sortedarr, arr);
    }
}