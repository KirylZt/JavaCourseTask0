package by.javacource.task0.service.impl;

import by.javacource.task0.entity.CustomArray;
import by.javacource.task0.service.SortService;

public class SortServiceImpl implements SortService {

    @Override
    public void bubbleSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    @Override
    public void insertionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            while (i>= 0) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
                i++;
            }
        }
    }

    @Override
    public void selectionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }
}
