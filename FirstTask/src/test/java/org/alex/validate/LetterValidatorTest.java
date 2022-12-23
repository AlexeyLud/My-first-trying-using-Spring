package org.alex.validate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LetterValidatorTest extends LetterValidator {

    @Test
    void testIsString() {
        String str = "Hello";
        assertTrue(LetterValidator.isString(str));
        String no_str = "f3!k&1a";
        assertFalse(LetterValidator.isString(no_str));
    }
}