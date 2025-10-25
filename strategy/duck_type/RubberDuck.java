package strategy.duck_type;

import strategy.Duck;
import strategy.fly.FlyNoWay;
import strategy.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}