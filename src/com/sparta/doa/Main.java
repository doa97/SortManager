package com.sparta.doa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	BubbleSort bubbleSort = new BubbleSort();
	int [] mixedNumbers = {7,5,9};
	bubbleSort.getSortedArray(mixedNumbers);
		System.out.println(Arrays.toString(bubbleSort.getSortedArray(mixedNumbers)));
    }
}
