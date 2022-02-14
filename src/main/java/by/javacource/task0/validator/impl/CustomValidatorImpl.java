package by.javacource.task0.validator.impl;

import by.javacource.task0.validator.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorImpl implements Validator {

    private static final ValidatorImpl instance = new ValidatorImpl();
    static final String STRING_AS_INT_ARRAY_REGEX = "(-?\\d{1,10};)+";

    public static Validator getInstance() {
        return instance;
    }

    @Override
    public boolean validate(String stringAsIntArray) {
        Pattern pattern = Pattern.compile(STRING_AS_INT_ARRAY_REGEX);
        Matcher matcher = pattern.matcher(stringAsIntArray);
        return matcher.matches();
    }

}
