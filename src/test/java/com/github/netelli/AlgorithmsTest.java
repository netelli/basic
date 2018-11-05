package com.github.netelli;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlgorithmsTest {
    @Test
    public void binarySearch() throws Exception {
        Algorithms alg = new Algorithms();
        List<Integer> myList = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
        int result = alg.binarySearch(myList, 2);
        assertEquals(-1, result);
        result = alg.binarySearch(myList, 3);
        assertEquals(1, result);
    }
}