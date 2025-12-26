### A Java Console Todo List
A simple menu-driven Todo List application written in Java that runs in the console.
Users can add tasks, edit task names, mark tasks as completed, and display all tasks.

This project focuses on object oriented design, input validation, and clean method decomposition

# Features
- Add new tasks
- Change the name of an existing task
- Mark tasks as completed
- Display all tasks with completion status
- Robust input validation (prevents crashes from invalid input)

# Menu Options and Format
----------------------------
Select a choice
1. Add Task
2. Change Task
3. Mark as completed
4. Show all tasks
----------------------------
Tasks are displayed using the following format

[ ] Buy groceries
[X] Finish homework

[ ] -> incomplete task
[X] -> completed task

# Design Overview

Classes

TodoList
- Manages the task list
- Handles user input and menu navigation
- Contains reusable helper methods for input validation and task operations

Task
- Represents a single task
- Stores: task name and completion status
- Provides getters, setters, and a formatted toString() method
