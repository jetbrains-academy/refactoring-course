# Task 1/1: Identify code issues and fix them

### Task

In this task, you will practice identifying and fixing code imperfections and bad practices.
Take a look at Kotlin function `calculate_area`, find issues related to naming, variable usage, and readability, and fix
them.

### Hints

<div class="hint" title="Redundant variable hint">

The variables `length` and `width` are redundant in this example since they are equivalent to the parameters `l`
and `w`.
Therefore, there is no need to create separate variables, and they can be safely removed.
</div>

<div class="hint" title="Naming hint">

In Kotlin, function names typically begin with a lowercase letter and follow the `camelCase` convention, without
underscores.
For example, `calculateArea()` appears to be a suitable name for a function, while `calculate_area` or `CalculateArea`
are less preferable.

The parameter names `l` and `w` are not sufficiently clear. Renaming them to `length` and `width` would greatly enhance
clarity.
</div>

<div class="hint" title="Formatting hint">
In Kotlin, you can skip using curly braces and the explicit return statement when a function consists of only one expression.
For example, 

```kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}
```

could be transformed to

```kotlin
fun sum(a: Int, b: Int): Int = a + b
```

which is referred to as a _single-expression function_.
</div>
