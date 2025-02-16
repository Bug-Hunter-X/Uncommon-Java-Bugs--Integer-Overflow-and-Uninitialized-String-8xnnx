# Uncommon Java Bugs

This repository demonstrates a couple of less common bugs that can occur in Java code:

1. **Integer Overflow:** Adding 1 to the maximum value of an `int` unexpectedly results in the minimum value due to integer overflow.
2. **Uninitialized String Variable:**  Using a string variable without first assigning it a value will cause a `NullPointerException`.

The `UncommonBug.java` file contains the buggy code. `UncommonBugSolution.java` shows how to avoid these issues. 