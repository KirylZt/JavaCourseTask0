package by.javacource.task0.creator.impl;

import by.javacource.task0.creator.CustomCreator;

import java.util.Random;

public class CustomCreatorImpl implements CustomCreator {
    @Override
    public int[] randomArray(int arrayLength, int bound) {
        int[] resultArray = new int[arrayLength];
        Random random = new Random();
        boolean positive;
        for (int i = 0; i < arrayLength; i++){
            positive = random.nextBoolean();
            if (positive) {
                resultArray[i] = random.nextInt(bound);
            }else {
            resultArray[i] = -random.nextInt(bound);
            }
        }
        return resultArray;
    }
}