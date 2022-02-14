package by.javacource.task0.reader;

import by.javacource.task0.exception.CustomException;

import java.util.List;

public interface CustomFileReader {

    List<String> readStringFromFile(String pathToFile) throws CustomException;

}
