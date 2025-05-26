package com.neetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        // [D]each row must contain non-duplicate 1-9 numbers;
        // [D]each column must contain non-duplicate 1-9 numbers;
        // [D]each 3x3 box must contain non-duplicate 1-9 numbers;

        return checkRow(board) && checkCol(board) && checkCube(board);
    }

    private boolean checkCube(char[][] board) {
        for (int bRow = 0; bRow < 3; bRow++) {
            for (int bCol = 0; bCol < 3; bCol++) {
                Map<Integer, Integer> freqMap = new HashMap<>();

                int startRow = bRow * 3;
                int startCol = bCol * 3;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char digit = board[startRow + i][startCol + j];

                        if (digit >= '1' && digit <= '9') {
                            int curr = digit - '0';
                            freqMap.put(curr, freqMap.getOrDefault(curr, 0) + 1);
                        }
                    }
                }
                for (int val : freqMap.values()) {
                    if (val > 1)
                        return false;
                }
            }
        }
        return true;
    }

    private boolean checkCol(char[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int j = 0; j < board.length; j++) {
                char digit = board[j][i];

                if (digit >= '1' && digit <= '9') {
                    int curr = digit - '0';
                    freq.put(curr, freq.getOrDefault(curr, 0) + 1);
                }
            }
            for (int val : freq.values()) {
                if (val > 1)
                    return false;
            }
        }
        return true;
    }

    private boolean checkRow(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int j = 0; j < board[i].length; j++) {
                char digit = board[i][j];

                if (digit >= '1' && digit <= '9') {
                    int curr = digit - '0';
                    freq.put(curr, freq.getOrDefault(curr, 0) + 1);
                }

            }
            for (int val : freq.values()) {
                if (val > 1)
                    return false;

            }
        }
        return true;
    }
}
