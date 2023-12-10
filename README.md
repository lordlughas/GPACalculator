# GPA Calculator

This repository contains a simple Java program for calculating the Grade Point Average (GPA) of a student based on their course scores.

## Features

- Input student name, course name, course unit, and course score.
- Calculate course grade and display remarks.
- Tabulate course information in a table.
- Calculate overall GPA.

## Usage

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/your-username/gpa-calculator.git
    ```

2. **Compile and Run:**
    ```bash
    cd gpa-calculator
    javac com/mycompany/gpacalculator/logic/GpaCalculator.java
    java com.mycompany.gpacalculator.logic.GpaCalculator
    ```

3. **Follow the prompts to input course details.**
   - Enter 'exit' to finish entering courses.

4. **View Results:**
   - The program will display a table of course information, the calculated GPA, and the overall remark.

## Grading System

The GPA is calculated based on the following grading system:


| Score Range | Grade | Grade Point | Remark               |
|-------------|-------|-------------|----------------------|
| 70-100      | A     | 5           | Excellent            |
| 60-69       | B     | 4           | Very Good            |
| 50-59       | C     | 3           | Good                 |
| 45-49       | D     | 2           | Fair                 |
| 40-44       | E     | 1           | Pass                 |
| 0-39        | F     | 0           | Fail                 |

### Overall Remark:
- Outstanding >= 4.5
- Excellent >= 3.5
- Good >= 2.5
- Average >= 1.5
- Below Average < 1.5
