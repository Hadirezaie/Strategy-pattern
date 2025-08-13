import duck.Duck;
import duck.fly.FlyRocketPowered;
import duck.specific_ducks.MallardDuck;
import duck.specific_ducks.ModelDuck;
import duck.specific_ducks.RubberDuck;

public class SimUDuck {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        System.out.println("\n---\n");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        System.out.println("\n---\n");

        // Duck model = new ModelDuck();
        // model.display();
        // model.performFly(); // اول نمی‌تواند پرواز کند

        // // تغییر رفتار پرواز در حین اجرا
        // model.setFlyBehavior(new FlyRocketPowered());
        // model.performFly(); // حالا با موشک پرواز می‌کند!
    }
}
