package org.alex.input;

import org.alex.validate.LetterValidator;
import java.util.Scanner;

public class InputStringChecking {

    public static String inputString(){
        Scanner in = new Scanner(System.in);
        String inp_str = null;
        while(true) {
            System.out.println("Input string: ");
            inp_str = in.next();
            if (LetterValidator.isString(inp_str)) {
                System.out.println("You input correct string");
                break;
            } else {
                System.out.println("You input not correct string!");
                continue;
            }
        }
        String input_str = inp_str;
        return input_str;
    }

}
