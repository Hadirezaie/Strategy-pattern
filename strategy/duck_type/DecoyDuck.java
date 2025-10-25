package strategy.duck_type;

import strategy.Duck;
import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}