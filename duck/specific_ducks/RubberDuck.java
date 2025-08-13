package duck.specific_ducks;

import duck.Duck;
import duck.fly.FlyNoWay;
import duck.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck!");
    }

}
