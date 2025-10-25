## SimUDuck — Strategy Pattern Example

This repository contains three implementations of a simple Duck simulator inspired by Head First Design Patterns. The goal is to show how behavior (flying, quacking) can be modeled using different designs and why the Strategy pattern is the recommended approach when behaviors vary independently from object types.

## Project layout
- `DuckSimulator.java` — simple runner demonstrating the `strategy` implementation and runtime behavior changes.
- `inheritance/` — naive inheritance-based approach. Behaviors live (or default) in the base `Duck` class and subclasses override them.
- `interfacebased/` — behavior interfaces (`Flyable`, `Quackable`) where concrete ducks implement the interfaces they need.
- `strategy/` — Strategy pattern implementation. Behavior is implemented by separate strategy objects that are composed into `Duck` objects and can be changed at runtime.

## What is the Strategy pattern? (short)
The Strategy pattern encapsulates interchangeable behaviors (strategies) in separate classes and delegates work to these objects. Instead of hard-coding behavior in the object or its class hierarchy, you inject a strategy object that implements a behavior interface. This enables:

- Reuse of common behavior implementations across many objects.
- Swapping or changing behavior at runtime.
- Cleaner separation of concerns: object identity (what the object is) is separate from how it behaves.

## Why Strategy here
- In the `strategy` package, `Duck` holds references to `FlyBehavior` and `QuackBehavior`. When the duck needs to fly or quack, it delegates to the current strategy object. You can change the strategy via `setFlyBehavior()` or `setQuackBehavior()` at runtime (this is shown in `DuckSimulator`).

## Quick comparison of the three approaches

- inheritance/
  - Pros: simple to understand, minimal moving parts.
  - Cons: fragile hierarchy, inappropriate shared methods (e.g., `fly()` on base class), lots of subclasses or duplicated code when behaviors vary.

- interfacebased/
  - Pros: avoids putting inappropriate methods on the base class by using behavior interfaces.
  - Cons: duplication of behavior implementations across classes, inflexible at runtime (cannot easily swap behaviors), and can lead to interface proliferation.

- strategy/
  - Pros: reusable behavior implementations, runtime flexibility, good separation of concerns. Scales well when combinations of behaviors grow.
  - Cons: slightly more classes/objects and indirection (but the tradeoff is worthwhile for flexibility and maintainability).

## Quick run (PowerShell)
From the repository root, compile all Java files and run the simulator. Example (PowerShell):

```powershell
javac -d . -sourcepath . (Get-ChildItem -Recurse -Filter "*.java" | ForEach-Object -ExpandProperty FullName)
java DuckSimulator
```

Notes:
- If your shell or environment does not support the compact compile line, you can compile via your IDE or `javac` on each package directory.

## Small 'contract' (for this code base)
- Inputs: concrete `Duck` classes (from `strategy.duck_type`) are constructed with default strategy objects.
- Outputs: calls like `performFly()` / `performQuack()` print behavior to stdout.
- Error modes: behaviors are simple and synchronous; no exceptions are expected under normal use.

## Edge cases / design considerations
- Default behaviors: ensure non-flying ducks are composed with a `FlyNoWay` strategy rather than leaving `fly()` undefined.
- Sharing strategies: strategy objects are stateless so you can share instances among ducks if desired.
- Evolution: if you add new behavior types (e.g., `DisplayBehavior`), follow the same pattern — define an interface and inject implementations.

<!-- ## Next steps (optional)
- Add a top-level example output in the README showing expected console lines from `DuckSimulator`.
- Add unit tests that assert behavior outputs or better, extract behavior into testable return values (instead of printing).

If you want, I can add the example output and small unit tests for the `strategy` package next — tell me which you'd prefer. -->