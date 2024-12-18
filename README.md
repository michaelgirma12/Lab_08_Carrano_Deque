
# Lab 08: Carrano Deque Implementation

This project is a Java implementation of a Deque (double-ended queue) based on the concepts from Frank M. Carrano's textbook.

## Features

- A `DLinkedDeque` class that uses a doubly-linked list for deque operations.
- A custom `EmptyQueueException` for handling errors.
- Interface-driven design with `DequeInterface`.
- Test cases in `Lab08DequeTest.java` to validate functionality.

## Getting Started

1. **Clone the Repository**:
    ```bash
    git clone <repository_url>
    cd Lab08-Carrano-Deque
    ```

2. **Compile the Project**:
    Navigate to the `src` directory and run:
    ```bash
    javac deque/*.java
    ```

3. **Run the Main Class**:
    ```bash
    java deque.Lab08Deque
    ```

4. **Run the Tests**:
    ```bash
    java deque.Lab08DequeTest
    ```

## File Structure

- `DequeInterface.java`: Defines the deque behavior.
- `DLinkedDeque.java`: Implements a deque using a doubly-linked list.
- `EmptyQueueException.java`: Custom exception class.
- `Lab08Deque.java`: Driver class demonstrating the deque usage.
- `Lab08DequeTest.java`: Test cases for deque methods.

## Notes

- This project was initially developed as part of a computer science lab.
- It is designed to run in a standard Java environment.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
