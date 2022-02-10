package by.javacource.task0.reader.impl;

import by.javacource.task0.exception.CustomException;
import by.javacource.task0.reader.CustomFileReader;

import by.javacource.task0.validator.Validator;
import by.javacource.task0.validator.impl.ValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class CustomFileReaderImpl implements CustomFileReader {

    static Logger logger = LogManager.getLogger();
    private static final String EMPTY_STRING = "";

    @Override
    public String readStringFromFile(String pathToFile) throws CustomException {
        File file = new File(pathToFile);

        if (file.exists() && file.length() == 0){
            return EMPTY_STRING;
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            Validator validator = ValidatorImpl.getInstance();
            String line;
            while ((line = bufferedReader.readLine()) != null){
                if (validator.validate(line)){
                    return line;
                }
            }

        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new CustomException(e);
        }
        logger.error("No valid array in " + pathToFile);
        throw new CustomException("No valid array in " + pathToFile);
    }

}
