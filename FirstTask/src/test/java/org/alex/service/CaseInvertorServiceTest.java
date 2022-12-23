package org.alex.service;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class CaseInvertorServiceTest extends CaseInvertorService {

    @Test
    void testChangeRegister() {
        String str = "Hello";
        String expected = "hELLO";
        String actual = CaseInvertorService.changeRegister(str);
        assertEquals(expected, actual, () -> "Change register about letter");
    }

}