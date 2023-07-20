# Task: 3/4: What are Pull Up and Push Down refactorings?

Let’s look at the code some and try to identify the problems.

To avoid code duplication and ensure consistency, we use the **Pull Up refactoring**. 
If multiple classes share the same fields/methods, we move them to a common base class. 
This way, we eliminate redundant code, and when fixing an issue in one place, it automatically applies to the rest, 
preventing inconsistencies.

We apply **Push Down refactoring** when a property/method in a superclass is used only in one of its subclasses. 
By moving the property/method to the specific subclass, we simplify the class hierarchy and improve code organization.
