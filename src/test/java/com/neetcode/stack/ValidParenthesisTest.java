package com.neetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesisTest {
    ValidParenthesis solution = new ValidParenthesis();

    @Test
    void testingValidParenthesisTrue() {
        String s = "()";
        assertTrue(solution.isValid(s));
    }

    @Test
    public void testingValidParenthesisFalse() {
        String s = "(]";
        assertFalse(solution.isValid(s));
    }
}
