# Task 1/3: Naming rules

Naming is one of the most important parts of writing code, it affects its understanding a lot.
A good name should be **descriptive** and **unambiguous**, and clearly reflect what code does.
Poor names lead to confusion and make it harder for other developers to understand and reuse.

One of the most frequently used refactorings is **Rename refactoring**. 
We change the name of the code element to make it more expressive, comply with naming conventions, or fix typos.

Here is the **set of rules** that we suggest to keep in mind when you try to come up with a good name:
- A name of package is usually a lowercase noun or a combination of nouns written in camelCase.
     For example, `org.example.project` or `org.example.myProject`.
- A name of class should start with uppercase letter and contain a noun or a combination of nouns written in 
[camelCase](https://en.wikipedia.org/wiki/Camel_case) naming convention. The name should describe what class is or what it does. 
For example, `Object`, `ArrayList`, or `ErrorReporter`.
- Names of functions, properties and local variables start with a lowercase letter and use the camel case and no underscores.
     For example, `getType()`, `handleRecord()`, `createMetaObject()`.
- Use [AI Assistant](https://blog.jetbrains.com/idea/2023/06/ai-assistant-in-jetbrains-ides/) to come up with better names for coding entities if you feel stuck. 
It is an IntelliJ IDEA plugin that uses ChatGPT to help with programming tasks (available only in EAP builds).

**See Also**: [Kotlin naming rules](https://kotlinlang.org/docs/coding-conventions.html#naming-rules)