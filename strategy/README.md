# Strategy-pattern implementation

This folder demonstrates the Strategy pattern: behaviors that vary (flying, quacking) are encapsulated as separate objects and composed into `Duck` instances.

What you'll find
- `Duck.java` — the abstract Duck class that has two behavior fields: `FlyBehavior` and `QuackBehavior`. It delegates `performFly()` and `performQuack()` to these objects and allows them to be changed at runtime via `setFlyBehavior()` / `setQuackBehavior()`.
- `behavior/FlyBehavior.java` — strategy interface for flying.
- `behavior/QuackBehavior.java` — strategy interface for quacking.
- `fly/FlyWithWings.java`, `fly/FlyNoWay.java`, `fly/FlyRocketPowered.java` — concrete flying strategies.
- `quack/Quack.java`, `quack/Squeak.java`, `quack/MuteQuack.java` — concrete quack strategies.
- `duck_type/*` — concrete `Duck` implementations that compose behaviors (e.g., `MallardDuck`, `RubberDuck`, `ModelDuck`).

How this approach works
- Each duck has references to behavior objects (strategies) rather than implementing the behaviors directly. The duck delegates behavior calls to the strategy objects. Because behaviors are objects, you can reuse implementations across ducks and change them at runtime.

Advantages vs previous approaches
- No code duplication for shared behavior: share a `FlyWithWings` instance across many ducks instead of copying `fly()` code into every class.
- Flexible at runtime: you can change a duck's behavior dynamically (see `setFlyBehavior()` / `setQuackBehavior()`), which is useful for cases like giving a model duck a rocket-powered flying ability at runtime.
- Keeps responsibilities separated: duck types describe what a duck is (display), while behaviors encapsulate how it acts.

When to use
- Use the Strategy pattern when you have behaviors that can vary independently from the object classes, when you want to reuse behavior implementations, or when you need to change behavior at runtime.

Example / How to run
- The project includes a `DuckSimulator` (root) that creates ducks from the `strategy` package and demonstrates swapping behaviors.

Quick compile & run (from repository root; PowerShell):

```powershell
javac -d . -sourcepath . $(Get-ChildItem -Recurse -Filter "*.java" | ForEach-Object FullName)
java DuckSimulator
```

Notes
- This is the recommended design among the three for real-world code because it cleanly separates behavior from object identity and avoids the maintenance and scalability problems shown in the `inheritance` and `interfacebased` folders.
