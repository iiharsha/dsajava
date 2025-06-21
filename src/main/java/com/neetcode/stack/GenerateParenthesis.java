package com.neetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        backtrack(res, curr, 0, 0 , n);
        return res;
    }

    private void backtrack(List<String> res, StringBuilder curr, int popen, int pclose, int max) {
        if (curr.length() == max * 2) {
            res.add(curr.toString());
            return;
        }

        if (popen < max) {
            curr.append('(');
            backtrack(res, curr, popen + 1, pclose, max);
            curr.deleteCharAt(curr.length() - 1);
        }


        if (pclose < popen) {
            curr.append(')');
            backtrack(res, curr, popen, pclose + 1, max);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
