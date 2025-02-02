package me.jh.pattern.decorator;

//ConcreteDecorator: 컴포넌트의 기능을 확장하는 클래스
public class SyrupDecorator extends CoffeeDecorator {

    public SyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost() + 200;
    }

    @Override
    public String description() {
        return coffee.description() + ", 시럽";
    }
}
