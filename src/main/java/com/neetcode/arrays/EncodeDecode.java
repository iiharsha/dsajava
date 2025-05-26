package com.neetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public String encode(String[] s) {

        StringBuilder sb = new StringBuilder();
        for (String word : s) {
            sb.append(word.length()).append(":").append(word);
        }

        return sb.toString();
    }

    public String[] decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            // get the index of the colon
            int colon = s.indexOf(':', i);
            // get the length of the word
            int len = Integer.parseInt(s.substring(i, colon)); // range from i to ':'

            i = colon + 1;

            String str = s.substring(i, i + len);
            res.add(str);
            i += len;
        }

        return res.toArray(new String[res.size()]);

    }
}
