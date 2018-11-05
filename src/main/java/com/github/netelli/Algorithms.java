package com.github.netelli;

import java.util.List;

public class Algorithms {

    public static void main(String[] args) {

    }

    public int binarySearch(List<Integer> list, int item) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = low + high;
            Integer guess = list.get(mid);
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
