package com.neetcode.arrays;

import java.util.Arrays;
import java.util.Objects;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar,tChar);
    }
}
