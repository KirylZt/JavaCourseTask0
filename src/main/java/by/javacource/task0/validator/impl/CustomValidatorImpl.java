package by.javacource.task0.validator.impl;

import by.javacource.task0.validator.CustomValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomValidatorImpl implements CustomValidator {

    private static final CustomValidatorImpl instance = new CustomValidatorImpl();
    static final String STRING_AS_INT_ARRAY_REGEX = "(-?\\d{1,10};)+";

    public static CustomValidator getInstance() {
        return instance;
    }

    @Override
    public boolean validateString(String stringAsIntArray) {
        Pattern pattern = Pattern.compile(STRING_AS_INT_ARRAY_REGEX);
        Matcher matcher = pattern.matcher(stringAsIntArray);
        return matcher.matches();
    }

}
