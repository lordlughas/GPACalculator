/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gpacalculator.Models;


/**
 *
 * @author CHARLES
 */

public class Course {
    public String name;
    public int unit;
    public double score;
    public int gradeUnit;
    public char grade;
    public String remark;

    public Course(String name, int unit, double score) {
        this.name = name;
        this.unit = unit;
        this.score = score;
        this.gradeUnit = getGradeUnit(score);
        this.grade = getGrade(score);
        this.remark = getRemark(score);
    }

    private int getGradeUnit(double score) {
        if (score >= 70) {
            return 5;
        } else if (score >= 60) {
            return 4;
        } else if (score >= 50) {
            return 3;
        } else if (score >= 45) {
            return 2;
        } else if (score >= 40) {
            return 1;
        } else {
            return 0;
        }
    }

    private char getGrade(double score) {
        if (score >= 70) {
            return 'A';
        } else if (score >= 60) {
            return 'B';
        } else if (score >= 50) {
            return 'C';
        } else if (score >= 45) {
            return 'D';
        } else if (score >= 40) {
            return 'E';
        } else {
            return 'F';
        }
    }

    private String getRemark(double score) {
        if (score >= 70) {
            return "Excellent, the sky is your limit!";
        } else if (score >= 60) {
            return "Very Good, reach for the stars!";
        } else if (score >= 50) {
            return "Good, you can do better!";
        } else if (score >= 45) {
            return "Fair, you have to put in more efforts";
        } else if (score >= 40) {
            return "Pass, you have a lot of work to do. Don't get discouraged!";
        } else {
            return "Fail";
        }
    }
}

