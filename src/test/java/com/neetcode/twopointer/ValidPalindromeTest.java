package com.neetcode.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {
    ValidPalindrome sol = new ValidPalindrome();

    @Test
    void testOne() {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = sol.isPalindrome(s);
        Assertions.assertEquals(true, ans);
    }

    @Test
    void testTwo() {
        String s = "race a car";
        boolean ans = sol.isPalindrome(s);
        Assertions.assertEquals(false, ans);
    }

    @Test
    void testThree() {
        String s = " ";
        boolean ans = sol.isPalindrome(s);
        Assertions.assertEquals(true, ans);
    }
}
