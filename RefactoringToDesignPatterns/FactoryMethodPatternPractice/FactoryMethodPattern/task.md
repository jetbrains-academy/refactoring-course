Let’s try to use the **Factory Method** design pattern to encapsulate the creation of objects and provide a more flexible
and maintainable approach to handling different transport modes.

Let’s take a look at the example in the editor. \
If you want to add new transport modes, you'll need to modify the existing client's code in the main method.
As the number of transport modes increases, the `if-else` structure can become hard to read.
