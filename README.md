# Task 1: Refactoring Code to Comply with the Liskov Substitution Principle (LSP)

## Problem Statement
The goal of this task is to analyze the provided simplified versions of `java.util.Date` and `java.sql.Timestamp` for violations of the **Liskov Substitution Principle (LSP)** and propose modifications to make the implementation compliant with this principle.

## Requirements
1. Create a unit test proving that LSP is broken. This test should be failing.
2. Refactor the `Timestamp` class to make it substitutable for `Date` according to LSP.
3. Unit test should start passing after refactor.

## Constraints
- You may create additional classes or interfaces as needed.
- Do not change the method names or parameters in the `Date` class.
- Follow clean code principles while focusing on LSP.
