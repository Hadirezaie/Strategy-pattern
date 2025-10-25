package inheritance;

public abstract class Duck {
    public void quack() {
        System.out.println("Quack quack!");
    }

    public void swim() {
        System.out.println("I'm swimming!");
    }

    public abstract void display();

    // Adding flying capability
    public void fly() {
        System.out.println("I'm flying!");
    }
}
