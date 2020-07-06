package com.company;

import java.io.IOException;
import java.util.Scanner;

public class GradeBookRunner {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Would you like to creat a new grade book? Y/N\n");
        String choice = input.nextLine();
        gradeBookOptions(choice);
    }

    public static void gradeBookOptions(String chosen) throws IOException {
        switch (chosen.toLowerCase()) {
            case ("y"):
                GradeBook student = new GradeBook();
                student.run();
                System.out.println("A grade book has been created!");
                main(null);
            case ("n"):
                System.exit(0);
            default:
                main(null);
        }
    }
}