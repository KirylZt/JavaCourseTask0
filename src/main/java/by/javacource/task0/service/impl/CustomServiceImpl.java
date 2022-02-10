package by.javacource.task0.service.impl;

import by.javacource.task0.entity.CustomArray;
import by.javacource.task0.service.CustomService;

public class CustomServiceImpl implements CustomService {

    @Override
    public int findMaxValue(CustomArray customArray) {
        int[] currentArray = customArray.getArray();
        int currentMaxValue = currentArray[0];

        for (int i=0; i < currentArray.length; i++){
            if (currentMaxValue < currentArray[i]){
                currentMaxValue = currentArray[i];
            }
        }
        return currentMaxValue;
    }

    @Override
    public int findMinValue(CustomArray customArray) {
        int[] currentArray = customArray.getArray();
        int currentMinValue = currentArray[0];

        for (int i=0; i < currentArray.length; i++){
            if (currentMinValue > currentArray[i]){
                currentMinValue = currentArray[i];
            }
        }
        return currentMinValue;
    }

    @Override
    public CustomArray replaceAllNegativeElements(CustomArray customArray, int newValue) {
        int[] currentArray = customArray.getArray();

        for (int i=0; i < currentArray.length; i++){
            if (currentArray[i] < 0){
                currentArray[i] = newValue;
            }
        }
        return customArray;
    }

    @Override
    public CustomArray replaceCustomElement(CustomArray customArray, int oldValue, int newValue) {
        int[] currentArray = customArray.getArray();

        for (int i=0; i < currentArray.length; i++){
            if (currentArray[i] == oldValue){
                currentArray[i] = newValue;
            }
        }
        return customArray;
    }

    @Override
    public int sumAllArgs(CustomArray customArray) {
        int sum = 0;
        int[] currentArray = customArray.getArray();
        for (int i=0; i < currentArray.length; i++){
            sum += currentArray[i];
        }
        return sum;
    }

    @Override
    public double averageValue(CustomArray customArray) {
        int avg = sumAllArgs(customArray)/customArray.getArray().length;
        return avg;
    }

    @Override
    public int countNegativeElements(CustomArray customArray) {
        int countN = 0;
        int[] currentArray = customArray.getArray();
        for (int i=0; i < currentArray.length; i++){
            if (currentArray[i] < 0){
                countN++;
            }
        }
        return countN;
    }

    @Override
    public int countPositiveElements(CustomArray customArray) {
        int countP = 0;
        int[] currentArray = customArray.getArray();
        for (int i=0; i < currentArray.length; i++){
            if (currentArray[i] > 0){
                countP++;
            }
        }
        return countP;
    }
}
