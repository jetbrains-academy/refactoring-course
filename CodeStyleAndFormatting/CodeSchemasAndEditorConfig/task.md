# Task 3/4: Code schemas and EditorConfig

IntelliJ IDEA provides two ways to comply with the project’s code style guidelines: code schemas and editor configs.
In this lesson, we will talk about the first one.

There are two predefined code schemas:
 - **Project scheme**: you configure settings for one specific project, they’re stored in the codeStyles folder under **.idea** and are shared through VCS together with the project.
 - **Default scheme**: you configure settings that could be applied to all projects you work on in IDE that have Default schema selected.

Note that code schemas are language-specific.

To configure **code schema**,
1. Press &shortcut:ShowSettings; to open the IDE settings and select Editor | Code Style.
2. Select the target programming language.
3. Select the code schema you would like to configure (Project or Default).
4. Configure code style settings such as tabs and indents, import settings (use single name import or import with *), and many other useful settings.

![Code Style](../../util/src/test/resources/images/imageCodeStyle.png)

Another way to configure code style settings is to define the **EditorConfig.**
Adding an EditorConfig to your project is pretty easy – you just need to add .editorconfig file to the directory you
would like to apply code style settings to. It is also possible to have several .editorconfig files in the project,
for example, one for source code and another for tests, just put them in the corresponding folders, and all settings
will be applied to all sub-folders.

There are two types of settings in .editorconfig files:
- Standart options from EditorConfig such as tabs_width or indent_size. The full list of options is available here.
- IntelliJ IDEA-specific options, their names start with the ij_ prefix. For example, ij_smart_tabs.

If some setting is not configured in .editorconfig, IDE takes it from the code schema.

See Also: [Detailed overview of formatting features by Trisha Gee ](https://blog.jetbrains.com/idea/2020/06/code-formatting/)
