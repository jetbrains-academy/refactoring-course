# Task 3/4: Rename refactoring in IDE

If you want to rename a code entity, you can click on the entity’s name and press
**&shortcut:RenameElement;** (macOS) or **Shift+F6** (Windows/Linux) shortcut.
IDE will provide several options for renaming, you can choose one of them or type your version.
After you pick a new name, **IDE will automatically change all occurrences of the entity** according to a new name not
only
in source code but also in code comments.

In contrast to it, you can rename code elements manually, but it’s tedious and not safe. You can change the name and
then use the compile errors to trace all the call sites to the renamed element. This can work, though it is tedious, but
it is not safe. Some problems could occur when doing manual renaming: e.g., accidental method overriding and accidental
name shadowing for variables and fields.

IntelliJ IDEA checks the **spelling** of all source code and comments in the project and highlights typos if there are
any.
It also provides a quick-fix for fixing typos.
It also checks grammar in texts in JavaDocs and README.md files and provides automatic fixes.

**See Also**: https://www.jetbrains.com/help/idea/proofreading.html
