# Java Console Todo List
A simple menu-driven Todo List application written in Java that runs in the console.
Users can add tasks, edit task names, mark tasks as completed, and display all tasks.

This project focuses on object oriented design, input validation, and clean method decomposition

## Features
- Add new tasks
- Change the name of an existing task
- Mark tasks as completed
- Display all tasks with completion status
- Robust input validation (prevents crashes from invalid input)

## Menu Options and Format
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

## Design Overview

Classes

TodoList
- Manages the task list
- Handles user input and menu navigation
- Contains reusable helper methods for input validation and task operations

Task
- Represents a single task
- Stores: task name and completion status
- Provides getters, setters, and a formatted toString() method

## Input Validation
- Menu input is validated using Scanner.hasNextInt() to prevent InputMismatchException
- Menu choices are restricted to a valid range
- Graceful feedback is provided when:
  - The task list is empty
  - A task name cannot be found
  - Invalid input is entered

# Example Output
Added: [ ] Study for exam
Task renamed to: Study for CS exam
Task marked as complete true
[X] Study for CS exam

How to Run

1. Clone the repository:

git clone https://github.com/your-username/java-todo-list.git

2. Open the project in Eclipse (or another Java IDE)

3. Run the todoList class

4. Follow the on-screen menu prompts

# Concepts Used
- Object-Oriented Programming (OOP)
- Java ArrayList
- Encapsulation
- Method decomposition
- Input validation
- Console-based user interaction

# Possible Future Improvements
- Assign unique IDs to tasks instead of using names
- Allow editing task descriptions
- Persist tasks using file I/O
- Add a GUI (JavaFX or Swing)
- Connect to a web frontend

# Author
Gunnar Seversen
CS Student – Java & Data Structures
