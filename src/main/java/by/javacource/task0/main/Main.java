package by.javacource.task0.main;

import by.javacource.task0.creator.CustomCreator;
import by.javacource.task0.creator.impl.CustomCreatorImpl;
import by.javacource.task0.entity.CustomArray;
import by.javacource.task0.exception.CustomException;
import by.javacource.task0.parser.CustomParser;
import by.javacource.task0.parser.impl.CustomParserImpl;
import by.javacource.task0.reader.CustomFileReader;
import by.javacource.task0.reader.impl.CustomFileReaderImpl;
import by.javacource.task0.service.CustomService;
import by.javacource.task0.service.SortService;
import by.javacource.task0.service.impl.CustomServiceImpl;
import by.javacource.task0.service.impl.SortServiceImpl;
import by.javacource.task0.validator.CustomValidator;
import by.javacource.task0.validator.impl.CustomValidatorImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        CustomFileReader customFileReader = new CustomFileReaderImpl();
        CustomParser parser = new CustomParserImpl();
        CustomValidator customValidator = new CustomValidatorImpl();
        CustomService service = new CustomServiceImpl();
        SortService sortService = new SortServiceImpl();
        CustomCreator customCreator = new CustomCreatorImpl();
        try {
            List<String> arrays = customFileReader.readStringFromFile("src/main/resources/data/arrays.txt");
            String line1 = arrays.get(0);
            String line2 = arrays.get(1);
            int[] intArr1 = parser.parse(line1);
            int[] intArr2 = parser.parse(line2);
            int[] intArr3 = customCreator.randomArray(5,100);
            CustomArray customArray1 = new CustomArray(intArr1);
            CustomArray customArray2 = new CustomArray(intArr2);
            CustomArray customArray3 = new CustomArray(intArr3);
            int resultInt;
            double resultDouble;
            resultInt = service.findMaxValue(customArray1);
            logger.info("Max value of array1 -> " + resultInt);
            resultDouble = service.averageValue(customArray2);
            logger.info("Average value of array2 -> " + resultDouble);
            resultDouble = service.countNegativeElements(customArray3);
            logger.info("Value of negative numbers in array3 -> " + resultDouble);


        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
