package com.example.mybignumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyBigNumberTest {

    private final MyBigNumber adder = new MyBigNumber();

    @Test
    void shouldAddTwoLargeNumbers() {
        assertEquals("123456789", adder.sum("123456789", "0"));
        assertEquals("999", adder.sum("123", "876"));
        assertEquals("111111111111111111111", adder.sum("111111111111111111111", "0"));
    }

    @Test
    void shouldHandleCarry() {
        assertEquals("1000", adder.sum("999", "1"));
        assertEquals("1000000000000000000000000000000000000000", adder.sum("999999999999999999999999999999999999999", "1"));
    }

    @Test
    void shouldRejectInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> adder.sum("12a", "5"));
        assertThrows(IllegalArgumentException.class, () -> adder.sum("", "5"));
        assertThrows(IllegalArgumentException.class, () -> adder.sum(null, "5"));
    }
}
