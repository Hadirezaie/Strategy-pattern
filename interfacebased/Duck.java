package interfacebased;

public abstract class Duck {
    public void swim() {
        System.out.println("I'm swimming!");
    }

    public abstract void display();
}

// Problem: Code duplication – if we have 50 ducks that can fly,
// we have to implement the fly method 50 times
