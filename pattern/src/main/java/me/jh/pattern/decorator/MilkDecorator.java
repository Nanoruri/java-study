package me.jh.pattern.decorator;

//ConcreteDecorator: 컴포넌트의 기능을 확장하는 클래스
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost() + 500;
    }

    @Override
    public String description() {
        return coffee.description() + ", 우유";
    }
}
