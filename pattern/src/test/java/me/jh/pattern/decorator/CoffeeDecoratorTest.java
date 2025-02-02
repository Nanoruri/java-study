package me.jh.pattern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeDecoratorTest {

    @Test
    void testBasicCoffee() {
        Coffee coffee = new BasicCoffee();
        assertEquals(3000, coffee.cost());
        assertEquals("기본 커피", coffee.description());
    }

    @Test
    void testMilkDecorator() {
        Coffee coffee = new MilkDecorator(new BasicCoffee());
        assertEquals(3500, coffee.cost());  // 3000 + 500
        assertEquals("기본 커피 + 우유", coffee.description());
    }

    @Test
    void testSyrupDecorator() {
        Coffee coffee = new SyrupDecorator(new BasicCoffee());
        assertEquals(3300, coffee.cost());  // 3000 + 300
        assertEquals("기본 커피 + 시럽", coffee.description());
    }

    @Test
    void testMilkAndSyrupDecorator() {
        Coffee coffee = new SyrupDecorator(new MilkDecorator(new BasicCoffee()));
        assertEquals(3800, coffee.cost());  // 3000 + 500 + 300
        assertEquals("기본 커피 + 우유 + 시럽", coffee.description());
    }
}
