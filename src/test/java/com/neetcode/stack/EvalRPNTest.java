package com.neetcode.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvalRPNTest {
    EvalRPN evaluator = new EvalRPN();
    @Test
    void testOne() {
        String[] tokens = {"2","1","+","3","*"};  // 2 + 3 = 5
        assertEquals(9, evaluator.evalRPN(tokens));
    }

    @Test
    void testTwo() {
        String[] tokens = {"4","13","5","/","+"};
        assertEquals(6, evaluator.evalRPN(tokens));
    }

    @Test
    void testingThree() {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        assertEquals(22, evaluator.evalRPN(tokens));
    }
}
