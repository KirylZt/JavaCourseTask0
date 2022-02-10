package by.javacource.task0.reader;

import by.javacource.task0.exception.CustomException;

public interface CustomFileReader {

    String readStringFromFile(String pathToFile) throws CustomException;

}
