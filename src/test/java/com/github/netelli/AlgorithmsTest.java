package com.github.netelli;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlgorithmsTest {
    private Algorithms alg = new Algorithms();

    @Test
    public void sumTest() throws Exception {
        int result = alg.sum(new ArrayList<>(Arrays.asList(1, 2, 3, 6)));
        assertEquals(12, result);
    }

    @Test
    public void selectionSortTest() throws Exception {
        List<Integer> myList = new ArrayList<Integer>(Arrays.asList(5, 3, 6, 2, 10));
        List<Integer> result = alg.selectionSort(myList);
        List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 6, 10));
        assertEquals(expectedResult, result);
    }

    @Test
    public void binarySearchTest() throws Exception {
        List<Integer> myList = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
        int result = alg.binarySearch(myList, 2);
        assertEquals(-1, result);
        result = alg.binarySearch(myList, 3);
        assertEquals(1, result);
    }
}