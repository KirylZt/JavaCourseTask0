package by.javacource.task0.main;

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
import by.javacource.task0.validator.Validator;
import by.javacource.task0.validator.impl.ValidatorImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        CustomFileReader customFileReader = new CustomFileReaderImpl();
        CustomParser parser = new CustomParserImpl();
        Validator validator = new ValidatorImpl();
        CustomService service = new CustomServiceImpl();
        SortService sortService = new SortServiceImpl();
        try {
            String line1 = customFileReader.readStringFromFile("src/main/resources/data/arrays.txt");
            int[] intArr = parser.parse(line1);
            CustomArray customArray = new CustomArray(intArr);
            int resultInt;
            double resultDouble;

            resultInt = service.findMaxValue(customArray);
            logger.info("Max value -> " + resultInt);

        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
