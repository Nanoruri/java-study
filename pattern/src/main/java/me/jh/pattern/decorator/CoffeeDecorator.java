package me.jh.pattern.decorator;

//Decorator: 컴포넌트의 기능을 확장하는 클래스
public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost();
    }

    @Override
    public String description() {
        return coffee.description();
    }
}
