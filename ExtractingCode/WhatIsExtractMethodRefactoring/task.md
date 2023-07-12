# Task: 1/4: What is Extract Method refactoring?

As we mentioned before, duplicated code can lead to undesirable effects such as when you fix a problem in one place, 
but forget to do it in duplicates, so the problem will still exist until you encounter the same problem again and fix 
it in another duplicate.

We recommend to avoid duplicated code, but what can you do if it already exists?
The solution is to extract the duplicated code into a separate new function and replace all occurrences with function’s calls.
Let’s consider the example…

Also, Extract Method refactoring could be applied to long methods. 
There is no an agreement on the maximum number of lines the method can contain. 
If the piece on code solves some specific problem and could be extracted into a separate one, 
consider its extraction and giving it a clear name.

