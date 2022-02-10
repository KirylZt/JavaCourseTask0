package by.javacource.task0.service;

import by.javacource.task0.entity.CustomArray;

public interface CustomService {
    int findMaxValue(CustomArray customArray);

    int findMinValue(CustomArray customArray);

    CustomArray replaceAllNegativeElements(CustomArray customArray, int newValue);

    CustomArray replaceCustomElement(CustomArray customArray, int oldValue, int newValue);

    double averageValue(CustomArray customArray);

    int sumAllArgs(CustomArray customArray);

    int countNegativeElements(CustomArray customArray);

    int countPositiveElements(CustomArray customArray);
}
