package com.sparta.doa.sorters;

public class BubbleSort implements Sorter{
    int temp = 0;
    public int[] getSortedArray(int[] unsortedArray) {
        for (int x = 0; x < unsortedArray.length - 1; x++) {

            for (int y = x + 1; y < unsortedArray.length - 1; y++) {
                if (unsortedArray[x] > unsortedArray[y]) {
                    temp = unsortedArray[x];
                    unsortedArray[x] = unsortedArray[y];
                    unsortedArray[y] = temp;

                }
            }
        }
        return unsortedArray;
    }

}