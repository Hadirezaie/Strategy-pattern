
// Usage

import strategy.Duck;
import strategy.duck_type.DecoyDuck;
import strategy.duck_type.MallardDuck;
import strategy.duck_type.RubberDuck;
import strategy.fly.FlyRocketPowered;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack(); // Quack quack!
        mallard.performFly(); // I'm flying with wings!

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performQuack(); // Squeak squeak!
        rubberDuck.performFly(); // I can't fly!

        Duck decoy = new DecoyDuck();
        decoy.performQuack(); // << Silence >>
        decoy.performFly(); // I can't fly!

        // Changing behavior at runtime
        Duck model = new DecoyDuck();
        model.performFly(); // I can't fly!
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // I'm flying with a rocket!
    }
}
