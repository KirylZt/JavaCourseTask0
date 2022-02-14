package by.javacource.task0.reader.impl;

import by.javacource.task0.exception.CustomException;
import by.javacource.task0.reader.CustomFileReader;

import by.javacource.task0.validator.CustomValidator;
import by.javacource.task0.validator.impl.CustomValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomFileReaderImpl implements CustomFileReader {

    static Logger logger = LogManager.getLogger();
    private static final String EMPTY_STRING = "";

    @Override
    public List<String> readStringFromFile(String pathToFile) throws CustomException {
        File file = new File(pathToFile);
        List<String> resultArray = new ArrayList<>();

        if (file.exists() && file.length() == 0) {
            resultArray.add(EMPTY_STRING);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            CustomValidator customValidator = CustomValidatorImpl.getInstance();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (customValidator.validateString(line)) {
                    resultArray.add(line);
                }
            }


        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new CustomException(e);
        }

        if (resultArray.isEmpty()) {
            logger.error("No valid array in " + pathToFile);
            throw new CustomException("No valid array in " + pathToFile);
        }else {
            return resultArray;
        }
    }
}
