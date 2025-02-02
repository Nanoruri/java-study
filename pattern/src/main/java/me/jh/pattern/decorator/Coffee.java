package me.jh.pattern.decorator;

//Component: 기본 기능을 뜻하는 컴포넌트 인터페이스
public interface Coffee {
    int cost();
    String description();
}

// Decorator 패턴 구조
//          Component (인터페이스)
//                 │
//      ┌─────────┴──────────┐
//ConcreteComponent    Decorator (추상 클래스)
//    │                      │
//BasicCoffee           MilkDecorator, SyrupDecorator ...
