package me.jh.pattern.delegate;

// caller
public class Printer implements PrinterDelegate {
    @Override
    public void print() {
        RealPrinter.print();// 실제 객체를 호출하여
    }
}
