package me.jh.pattern.decorator;

//ConcreteComponent: 컴포넌트의 실질적인 기능을 구현하는 클래스
public class BasicCoffee implements Coffee {

    @Override
    public int cost() {
        return 1000;
    }

    @Override
    public String description() {
        return "기본 커피";
    }
}
