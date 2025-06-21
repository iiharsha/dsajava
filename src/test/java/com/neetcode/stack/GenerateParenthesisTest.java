package com.neetcode.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;

class GenerateParenthesisTest {

    @Test
    void testGenerateParenthesis_n1() {
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> expected = Arrays.asList("()");
        List<String> result = gp.generateParenthesis(1);

        assertEquals(expected.size(), result.size(), "Output size mismatch");
        assertTrue(result.containsAll(expected), "Missing expected elements");
    }

    @Test
    void testGenerateParenthesis_n2() {
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> expected = Arrays.asList("(())", "()()");
        List<String> result = gp.generateParenthesis(2);

        assertEquals(expected.size(), result.size(), "Output size mismatch");
        assertTrue(result.containsAll(expected), "Missing expected elements");
    }

    @Test
    void testGenerateParenthesis_n3() {
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(3);

        // There are 5 valid combinations for n = 3 (Catalan(3) = 5)
        assertEquals(5, result.size());

        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertTrue(result.containsAll(expected), "Missing expected combinations");
    }

    @Test
    void testGenerateParenthesis_n0() {
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(0);

        assertEquals(1, result.size()); // should return a list with empty string
        assertEquals("", result.get(0));
    }
}
