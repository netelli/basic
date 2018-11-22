package com.github.netelli;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {

    public static void main(String[] args) {

    }

    public int binarySearch(List<Integer> list, int item) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = low + high;
            int guess = list.get(mid);
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

    public List<Integer> selectionSort(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(list);
            newList.add(list.get(smallest));
            list.remove(smallest);
        }
        return newList;
    }

    private int findSmallest(List<Integer> list) {
        int smallest = list.get(0);
        int smallest_index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    /**
     * Used recursion for calculate sum
     * @param list
     * @return
     */
    public int sum(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.get(0) + sum(list.subList(1, list.size()));
        }
    }

    /**
     * Used recursion for calculate count of the elements in the list
     * @param list
     * @return
     */
    public int count(List list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            return 1 + count(list.subList(1, list.size()));
        }
    }

    public int findBiggest(List<Integer> list) {
        if (list.size() == 2) {
            if (list.get(0) > list.get(1)) {
                return list.get(0);
            } else {
                return list.get(1);
            }
        } else {
            int sub_biggest = findBiggest(list.subList(1, list.size()));
            if (list.get(0) > sub_biggest) {
                return list.get(0);
            } else {
                return sub_biggest;
            }
        }
    }
}
