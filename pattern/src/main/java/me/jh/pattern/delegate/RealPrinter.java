package me.jh.pattern.delegate;

//delegate
public class RealPrinter {

    //static으로 선언되어있어 테스트가 어려운 코드
    public static void print() {
        System.out.println("Printer로 출력 중");
    }
}
