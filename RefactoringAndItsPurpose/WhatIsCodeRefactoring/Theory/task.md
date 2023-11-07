# Task 1/2: What is code refactoring?

**_Refactoring_** is a process of modifying source code without changing its behavior. For example, renaming a method or
extracting a _magic constant_ into a separate variable. It improves code readability but doesn’t change what code does.

The purpose of refactoring is to **improve code readability and simplify its maintenance**. Usually, software developers
work in teams on code bases and spend considerable time reading each other’s code, so it is important to make your code
clear and clean. 

Let's take a look at two code snippets below.

**Before refactoring:**

```kotlin
fun calculate(r: Double): Double {
    return 3.14159 * r * r
}

fun main() {
    val n = 5.0
    val result = calculate(n)
    println("Circle area is: $result")
}
```

In this snippet of code, method name `calculate` isn't descriptive, making it unclear what it calculates.
Variable `n` and method parameter `r` don't provide any information about their purpose.
The constant `3.14159` is hard-coded within the method, leading to lack of clarity.

**After refactoring:**

```kotlin
const val PI_VALUE = 3.14159

fun calculateCircleArea(radius: Double): Double = PI_VALUE * radius * radius

fun main() {
    val circleRadius = 5.0
    val area = calculateCircleArea(circleRadius)
    println("Circle area is: $area")
}
```

To improve readability of the original snippet of code, the following refactorings were applied:

- Method `calculate` was **renamed** to `calculateCircleArea` to better express its purpose: calculating the area of a
  circle.
- The curly braces and the return statement were omitted because the function contains only a single expression.
- Variable `n` was **renamed** to `circleRadius` for better code clarity.
- Parameter `r` was **renamed** to `radius` for better code clarity.
- `PI_VALUE` constant was **extracted** to hold the value of `Pi` value, making the calculation formula more
  understandable and reusable.