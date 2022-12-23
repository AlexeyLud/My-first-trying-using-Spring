package org.alex.validate;

public class LetterValidator {

    public static boolean isString(String str){
        return str.matches("[a-zA-Z]+");
    }

}
