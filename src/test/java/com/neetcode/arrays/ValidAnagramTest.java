package com.neetcode.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramTest {
    ValidAnagram sol = new ValidAnagram();

    @Test
    public void testingIsAnagramTrue() {
        assertTrue(sol.isAnagram("silent", "listen"));
        assertTrue(sol.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void testingIsAnagramFalse() {
        assertFalse(sol.isAnagram("rat", "car"));
        assertFalse(sol.isAnagram("hello", "helloo"));
    }

    @Test
    public void testingIsAnagramEdgeCases() {
        assertTrue(sol.isAnagram("", ""));
        assertFalse(sol.isAnagram("hello", ""));
    }

}
