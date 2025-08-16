package inheritance;

public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Squeak squeak!");
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber duck");
    }

    @Override
    public void fly() {
        // Rubber duck doesn't fly – what should we do?
        // Either do nothing (silently) or throw an error
        System.out.println("I can't fly!");
    }
}