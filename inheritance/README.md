# Inheritance-based implementation (Head First Design Patterns)

This folder shows a simple, inheritance-based approach to modeling different kinds of ducks.

What you'll find
- `Duck.java` — an abstract base class that provides default implementations for `quack()` and `swim()` and declares `display()` as abstract. It also includes a `fly()` method on the base class.
- `MallardDuck.java` — a concrete duck that inherits from `Duck` and implements `display()`.
- `RubberDuck.java` — a concrete duck that overrides `quack()` and `fly()` to provide rubber-duck-specific behavior.

How this approach works
- All ducks derive from a common `Duck` superclass. Common behaviors (e.g., `swim`) live in the base class. Subclasses override behavior methods when they need specialized behavior.

Disadvantages / problems with this approach
- Fragile class hierarchy: behavior changes often require creating new subclasses or adding many conditionals across subclasses.
- Inappropriate shared behavior: the base class defines `fly()` for all ducks; non-flying ducks (like `RubberDuck`) must override it (possibly with a no-op or a message), which is conceptually wrong and error-prone.
- Violates the Open/Closed Principle: adding a new behavior or changing behavior for multiple duck types often requires editing many classes.
- Code duplication and proliferation of classes when behavior combinations increase.

When to use
- Useful as a simple first step or demonstration, but problematic for real code when behaviors vary independently among objects. See the `strategy` folder for a better design.

Notes
- This implementation intentionally illustrates the limitations of inheritance for behavior reuse and variation.