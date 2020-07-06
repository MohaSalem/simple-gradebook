package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GradeBook {

    public GradeBook() {
    }

    Scanner input = new Scanner(System.in);

    public void run() throws IOException {
        System.out.println("Enter the student name in letters.....\n");
        String studentName = input.nextLine();
        String fileName = studentName + "_Results.txt";
        File file = new File(fileName);
        try {
            boolean isCreated = file.createNewFile();
            checkFileCreation(studentName, isCreated);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        //Inserting the grades of the student after checking specific logic!
        FileWriter fileWriter = new FileWriter(fileName);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        System.out.println("Enter the students' grade of task1 in numbers!\n");
        String task1 = input.nextLine();
        while (task1 != null) {
            if (Integer.parseInt(task1) <= 10) {
                printWriter.println("Task 1 grade is " + task1);
                break;
            } else {
                System.out.println("The maximum grad of Task 1 is 10, please enter the grade again");
                String task_1 = input.nextLine();
                task1 = task_1;
            }
        }
        System.out.println("Enter the students' grade of task2 in numbers!\n");
        String task2 = input.nextLine();
        while (task2 != null) {
            if (Integer.parseInt(task2) <= 10) {
                printWriter.println("Task 2 grade is " + task2);
                break;
            } else {
                System.out.println("The maximum grad of Task 2 is 10, please enter the grade again");
                String task_2 = input.nextLine();
                task2 = task_2;
            }
        }
        System.out.println("Enter the students' grade of midterm in numbers!\n");
        String midTerm = input.nextLine();
        while (midTerm != null) {
            if (Integer.parseInt(midTerm) <= 30) {
                printWriter.println("Midterm grade is " + midTerm);
                break;
            } else {
                System.out.println("The maximum grad of Midterm  is 30, please enter the grade again");
                String correctMidterm = input.nextLine();
                midTerm = correctMidterm;
            }
        }
        System.out.println("Enter the students' grade of examination in numbers!\n");
        String examination = input.nextLine();
        while (examination != null) {
            if (Integer.parseInt(examination) <= 50) {
                printWriter.println("Examination grade is " + examination);
                break;
            } else {
                System.out.println("The maximum grad of Examination is 50, please enter the grade again");
                String correct_Examination = input.nextLine();
                examination = correct_Examination;
            }
        }
        int totalMarks = Integer.parseInt(task1) + Integer.parseInt(task2) + Integer.parseInt(midTerm) + Integer.parseInt(examination);
        printWriter.println("The amount of marks gained during the course is " + totalMarks);
        printWriter.close();
    }


    private void checkFileCreation(String studentName, boolean isCreated) {
        if (isCreated) {
            System.out.println("A file named " + studentName + "_Results.txt has been created!");
        } else {
            System.out.println("No file is created!");
        }
    }
}
