# Task: 1/2: Cohesion and coupling

_**Cohesion**_ and _**coupling**_ are fundamental concepts in software design, which determine how well the components of a
system are organized and how they interact with each other. Move refactorings can play a crucial role in improving
cohesion and reducing coupling within the codebase.

**_Cohesion_** refers to how well the parts of a module (such as a class or a function) are related and focused on doing
one
specific job.
**High cohesion** means that the elements inside the module work closely together and share a common purpose.
On the other hand, **low cohesion** means that the elements inside the module perform various
unrelated tasks, making the module less organized and harder to understand.

To improve cohesion, ensure that each class and method has a clear and singular responsibility.

_**Coupling**_ refers to how much different parts of a program depend on each other.
**Low coupling** means that the parts are more independent, making it easier to change one part without
impacting others.
On the other hand, **high coupling** means that the parts are closely interconnected, so changes in one part may affect
many others.

To improve coupling, use Move refactoring to reorganize code elements, such as methods and fields, to reduce direct
dependencies between different modules or classes.
Reducing coupling while increasing cohesion leads to a more maintainable and flexible codebase.
