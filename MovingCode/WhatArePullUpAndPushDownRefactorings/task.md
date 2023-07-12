# Task: 3/4: What are Pull Up and Push Down refactorings?

Let’s look at the code some and try to identify the problems.

We use **Pull Up** refactoring to move similar fields/methods to the base class, removing duplicated code. 
One of the reasons why we recommend to avoid duplicated code is that if you discover some problem and fix in only one place,
the rest will still have this problem.

We use **Push Down** refactoring in cases when superclass has property/method which is used only in one of its subclasses.
