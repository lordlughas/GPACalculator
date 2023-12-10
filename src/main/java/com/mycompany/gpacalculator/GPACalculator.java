/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gpacalculator;


/**
 *
 * @author CHARLES
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.mycompany.gpacalculator.Models.Course;


public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to your Grading System");

        // Input student name
        String studentName = getNonEmptyInput(scanner, "Enter student name: ");

        List<Course> courses = new ArrayList<>();

        // Input multiple courses
        while (true) {
            System.out.print("Enter course name (or type 'exit' to finish): ");
            String courseName = scanner.nextLine().trim();

            if (courseName.equalsIgnoreCase("exit")) {
                break;
            }

            int courseUnit = getPositiveIntInput(scanner, "Enter course unit: ");
            double courseScore = getValidDoubleInput(scanner, "Enter course score: ");

            // Add the course to the list
            courses.add(new Course(courseName, courseUnit, courseScore));
        }

        // Display student name
        System.out.printf("Student Name: %s%n", studentName);

        // Display the result in tabular form
        displayResult(courses);
       
        
        
    }
    private static void displayResult(List<Course> courses) {
            System.out.println("|----------------------------|-----------------------|---------------------|---------------------|");
            System.out.printf("| %-26s | %-21s | %-18s | %-18s |%n",
                    "COURSE & CODE", "COURSE UNIT", "GRADE", "GRADE-UNIT");
            System.out.println("|----------------------------|-----------------------|---------------------|---------------------|");

            double totalQualityPoint = 0;
            int totalGradeUnit = 0;

            // Display information for each course
            for (Course course : courses) {
                System.out.printf("| %-26s | %-21d | %-18c | %-18d |%n",
                        course.name, course.unit, course.grade, course.gradeUnit);

                totalQualityPoint += course.unit * course.gradeUnit;
                totalGradeUnit += course.unit;
                
            }

            System.out.println("|-------------------------------------------------------------------------------------------------|");
            // Calculate GPA
            double gpa = totalGradeUnit > 0 ? totalQualityPoint / totalGradeUnit : 0;

            // Display overall GPA
            System.out.printf("Your GPA is = %.2f to 2 decimal places.%n", gpa);
            

        }

        private static String getNonEmptyInput(Scanner scanner, String prompt) {
            String input;
            do {
                System.out.print(prompt);
                input = scanner.nextLine().trim();
            } while (input.isEmpty());
            return input;
        }

        private static int getPositiveIntInput(Scanner scanner, String prompt) {
            int input;
            do {
                System.out.print(prompt);
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid integer.");
                    scanner.next(); // Consume the invalid input
                }
                input = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } while (input <= 0);
            return input;
        }

        private static double getValidDoubleInput(Scanner scanner, String prompt) {
            double input;
            do {
                System.out.print(prompt);
                while (!scanner.hasNextDouble()) {
                    System.out.println("Please enter a valid double.");
                    scanner.next(); // Consume the invalid input
                }
                input = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
            } while (input < 0 || input > 100); // Assuming scores are between 0 and 100
            return input;
        }
    }

    
