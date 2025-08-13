package duck.specific_ducks;

import duck.Duck;
import duck.fly.FlyNoWay;
import duck.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck!");
    }

}
