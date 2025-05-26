package com.neetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class EncodeDecodeTest {

    EncodeDecode codec = new EncodeDecode();

    @Test
    public void testEncodeDecode_basicCase() {
        String[] input = { "hello", "world" };
        String encoded = codec.encode(input);
        String[] decoded = codec.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncodeDecode_withEmptyStrings() {
        String[] input = { "", "a", "" };
        String encoded = codec.encode(input);
        String[] decoded = codec.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncodeDecode_withSpecialCharacters() {
        String[] input = { "1:one", "two:2", "three:three" };
        String encoded = codec.encode(input);
        String[] decoded = codec.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncodeDecode_withUnicodeCharacters() {
        String[] input = { "你好", "🌍", "こんにちは" };
        String encoded = codec.encode(input);
        String[] decoded = codec.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncodeDecode_emptyArray() {
        String[] input = {};
        String encoded = codec.encode(input);
        String[] decoded = codec.decode(encoded);
        assertArrayEquals(input, decoded);
    }
}
