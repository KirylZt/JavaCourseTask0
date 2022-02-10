package by.javacource.task0.parser.impl;

import by.javacource.task0.exception.CustomException;
import by.javacource.task0.parser.CustomParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomParserImpl implements CustomParser {
    static Logger logger = LogManager.getLogger();
    private static final String STRING_SPLIT_REGEX = ";";

    public int[] parse(String StringAsIntArray) throws CustomException {

        if (StringAsIntArray.isEmpty()) {
            logger.error("Not found correct data to parse.");
            throw new CustomException("Not found correct data to parse.");
        }

        String[] strArr = StringAsIntArray.split(STRING_SPLIT_REGEX);
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        return intArr;
    }
}
