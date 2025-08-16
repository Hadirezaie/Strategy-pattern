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

// Problem: For every small change in behavior, we have to create a new subclass
// and if we want to change the fly behavior for all ducks, it becomes
// problematic
