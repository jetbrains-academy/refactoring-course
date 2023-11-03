# Task 1/3: Rename refactoring in IDE

If you want to rename a code entity, you can click on the entity’s name and press the
**&shortcut:RenameElement;** (macOS) or **Shift+F6** (Windows/Linux) shortcut.
The IDE will provide several options for renaming, you can choose one of them or type your own version.
After you pick a new name, the **IDE will automatically change all occurrences of the entity** according to the new name not
only
in the source code but also in code comments.

Alternatively, you can rename code elements manually, but it’s tedious and not safe. You can change the name and
then use the compile errors to trace all the call sites to the renamed element. This method can work, though it is slow and
error-prone. Some problems could occur when doing manual renaming: e.g., accidental method overriding or accidental
name shadowing for variables and fields.

IntelliJ IDEA checks the **spelling** of all source code and comments in the project and highlights typos if there are
any.
It also provides a quick fix for the typos.
Besides, it checks the grammar in the JavaDocs and README.md files and provides automatic fixes.

**See Also**: [Spellchecking in IntelliJ IDEA](https://www.jetbrains.com/help/idea/spellchecking.html)
