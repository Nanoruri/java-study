package me.jh.pattern.delegate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PrinterTest {

    @Test
    void testPrint() {
        PrinterDelegate printer = new Printer();
        assertDoesNotThrow(printer::print);
    }
}
