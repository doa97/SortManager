package com.sparta.doa.sorters;

public class MergeSorter<i> implements Sorter {
    public static void main(String[] args) {
        int[] array = {7, 3, 21, 5, 15, 30, 8};

        int[] sortedArray = new int[array.length];
        int temp1 = 0,j = 0;

        for (int i = 0; i <= sortedArray.length-3; i++)
            if (sortedArray[i] == array.length-3) {
                temp1 = array[i];
                i++;
            }

    }

    @Override
    public int[] getSortedArray(int[] arrayToSort) {
        return new int[0];
    }

}


//
//        private int[] mergeArrays (int[]) {
//
//        }
//    }
//}