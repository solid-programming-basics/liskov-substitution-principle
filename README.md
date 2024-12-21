# Task 1: Refactoring Code to Comply with the Liskov Substitution Principle (LSP)

## Problem Statement
The goal of this task is to analyze the provided simplified versions of `java.util.Date` and `java.sql.Timestamp` for violations of the **Liskov Substitution Principle (LSP)** and propose modifications to make the implementation compliant with this principle.

## Requirements
1. Refactor the `Timestamp` class to make it substitutable for `Date` according to LSP.
2. The **interface of the `Date` class** must remain unchanged. Specifically, the public method signatures cannot be modified.

## Constraints
- You may create additional classes or interfaces as needed.
- Do not change the method names or parameters in the `Date` class.
- Follow clean code principles while focusing on LSP.
