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
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        assertArrayEquals(Sortedarr, arr);
    }

    public void testNegative() {
        int[] arr = {-8, -3, -5, -1, -7};
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        int[] Sortedarr = {-8, -7, -5, -3, -1};
        assertArrayEquals(Sortedarr, arr);
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