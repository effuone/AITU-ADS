# AITU Algorithms and Data Sctructures Course 

## Introduction
This homework-assignments repository is designed to show a solutions for a series of computational problems, ranging from mathematical computations like finding the Greatest Common Divisor (GCD) to string manipulations such as reversing a string. Each problem is encapsulated within its class, and the program allows users to select and execute solutions through a simple interface.

## Setup Instructions

### Prerequisites
- Java JDK 11 or higher
- An IDE that supports Java (e.g., IntelliJ IDEA, Eclipse, or VSCode with the Java Extension Pack)

### Installation
1. Clone the repository or download the source code to your local machine.
   ```sh
   git clone https://github.com/effuone/AITU-ADS.git
   ```
2. Open the project in your preferred IDE.
3. Ensure that the JDK is correctly set up in your project's settings.

### Building the Program
- Most IDEs provide a way to build the project through the interface. Look for a "Build" option, usually found in the top menu.
- Alternatively, if you are using a terminal, navigate to your project directory and run:
   ```sh
   javac Main.java
   ```

## How to Use
1. Run the `Main` class. This can typically be done by right-clicking on the `Main.java` file in your IDE and selecting "Run Main.main()".
2. The program will prompt you to enter a problem number corresponding to the problem you wish to solve. For example:
   ```
   Enter the problem number to run (e.g., 1 for ProblemOne):
   ```
3. Enter the problem number of your choice and press Enter.
4. Depending on the selected problem, you may need to enter additional inputs (e.g., numbers or strings) as prompted by the program.
5. The solution to the problem will be displayed, along with the execution time.

## Adding New Problems
To add a new problem:
1. Create a new class in the `Solutions` package following the existing naming convention (`ProblemEleven`, `ProblemTwelve`, etc.).
2. Implement the problem solution and a `demo` method within your class.
3. Add a new entry to the `problemActions` map in the `Main` class, mapping the new problem number to your class's `demo` method.
