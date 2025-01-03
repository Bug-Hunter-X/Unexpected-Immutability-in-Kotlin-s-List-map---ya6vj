# Kotlin List.map() Immutability

This repository demonstrates a common misconception in Kotlin regarding the immutability of lists when using the `map()` function. The `map()` function creates a *new* list containing the transformed elements, rather than modifying the original list in place. This can lead to unexpected behavior if the programmer assumes the original list is modified.

The `bug.kt` file shows the code with the potential error.  The `bugSolution.kt` file provides a solution demonstrating how to handle this correctly.