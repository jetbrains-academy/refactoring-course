# Task 1/3: What is Extract Method refactoring?

As we mentioned before, duplicated code can lead to undesirable effects, such as when you fix a problem in one place 
but forget to do it in duplicates, so the problem will still exist until you encounter the same problem again and 
fix it in another duplicate.
We recommend avoiding duplicated code, but what can you do if it already exists? 
The solution is to extract the duplicated code into a separate new function and replace all occurrences with function calls.

Also, Extract Method refactoring could be applied to long methods. 
While there's no fixed limit on the number of lines a method should have, consider extracting a piece of code 
into a separate method if it solves a specific problem. 
It improves code readability and organization.

Smaller functions make the code easier to read and understand, as each method focuses on a specific task, 
making the overall flow more evident.
