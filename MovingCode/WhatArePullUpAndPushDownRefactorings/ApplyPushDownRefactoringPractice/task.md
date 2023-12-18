### Task

In the `Animal` file, there are methods that are common for all animal types such as `sleep()` and `eat()`.
You need to identify methods that are specific for some animals and apply the Push Down refactoring
to move them to the corresponding classes from the base interface.

### Hints

<div class="hint" title="Shortcut for Push Down refactorings">

  Use the &shortcut:Refactorings.QuickListPopupAction; (macOS) or `Shift+Ctrl+Alt+T` (Windows/Linux) shortcut to Push Down a code element.
</div>

<div class="hint" title="Refactoring Hint">

Make sure that you deleted not relevant methods after refactoring in `Cat` and `Dog` classes.
For example, `meow()` method should be only in the `Cat` class.
</div>
