# Interface-based implementation

This folder demonstrates an approach where behaviors are defined as interfaces and concrete ducks implement the interfaces they need.

What you'll find
- `Duck.java` — an abstract base class with common non-behavioral methods (e.g., `swim`) and an abstract `display()` method.
- `Flyable.java` — a `fly()` interface for ducks that can fly.
- `Quackable.java` — a `quack()` interface for ducks that can quack.
- `MallardDuck.java` — implements `Flyable` and `Quackable` and provides the concrete behavior methods.
- `RubberDuck.java` — implements `Quackable` only; it does not implement `Flyable`.

How this approach works
- Instead of placing every behavior in a single base class, behavior contracts are expressed as interfaces (`Flyable`, `Quackable`) and concrete ducks implement the interfaces they support. This avoids putting inappropriate methods on the base class.

Disadvantages / problems with this approach
- Code duplication: each concrete class must provide its own implementation of behavior methods. If many ducks share the same implementation (e.g., many ducks fly the same way), you will duplicate that code across classes.
- Rigid at runtime: changing a duck's behavior at runtime is awkward because behavior is implemented directly on the duck class (no reusable behavior objects to swap).
- Interface explosion: if you need several behavior variations and combinations, the number of interfaces and combinations can grow, and wiring behavior remains manual in each class.

When to use
- This is an improvement over the naive inheritance-only approach because it avoids putting inappropriate methods on the base type. It is acceptable for small examples, but it doesn't scale well when behaviors need to be shared or changed at runtime.

Notes
- The `strategy` folder contains a more flexible design where behavior is delegated to strategy objects instead of implemented directly on each class.
