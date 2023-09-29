# Task 1/2: Naming rules

Naming is one of the most important parts of code writing, as it significantly affects code understandability.
A good name should be **descriptive** and **unambiguous** and clearly reflect what code does.
Poor names lead to confusion and make it harder for other developers to understand and reuse the code.

One of the most frequently used refactorings is **Rename refactoring**. 
We change the name of a code element to make it more expressive and complying with naming conventions, or fix typos.

Here is a **set of rules** that we recommend to keep in mind when you try to come up with a good name:
- The name of a package is usually a lowercase noun or a combination of nouns written in camelCase.
     For example, `org.example.project` or `org.example.myProject`.
- The name of a class should start with an uppercase letter and contain a noun or a combination of nouns written according to the 
[camelCase](https://en.wikipedia.org/wiki/Camel_case) naming convention. The name should describe what the class is or what it does. 
For example, `FileReader`, `NetworkManager`, or `ErrorReporter`.
- The names of functions, properties, and local variables start with a lowercase letter and use the camel case without underscores.
     For example, `getType()`, `handleRecord()`, `createMetaObject()`.
- Use the [AI Assistant](https://blog.jetbrains.com/idea/2023/06/ai-assistant-in-jetbrains-ides/) to come up with better names for code entities if you feel stuck. 
It is an IntelliJ IDEA plugin that uses ChatGPT to help with programming tasks (available only in EAP builds).

**See Also**: [Kotlin naming rules](https://kotlinlang.org/docs/coding-conventions.html#naming-rules)
