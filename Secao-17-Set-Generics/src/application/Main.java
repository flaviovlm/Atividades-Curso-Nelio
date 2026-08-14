package application;

import java.awt.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static void main(String[] args) {

        Set<Integer> amountStudentA = new HashSet<>();
        Set<Integer> amountStudentB = new HashSet<>();
        Set<Integer> amountStudentC = new HashSet<>();
        Set<Integer> amountFull = new HashSet<>(amountStudentA);

        Scanner sc = new Scanner(System.in);

        for (char nameCourse = 'A'; nameCourse < 'D'; nameCourse++) {
            System.out.println("How many students for course " + nameCourse + "?");
            System.out.print("Amount: ");
            int amount = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the students the numbers for course " + nameCourse);
            int student;
            for (int i = 0; i < amount; i++) {
                student = sc.nextInt();
                if (nameCourse == 'A') {
                    amountStudentA.add(student);
                    System.out.println(amountStudentA);
                } else if (nameCourse == 'B') {
                    amountStudentB.add(student);
                    System.out.println(amountStudentB);
                } else {
                    amountStudentC.add(student);
                    System.out.println(amountStudentC);
                }
            }
        }
        amountFull.addAll(amountStudentB);
        amountFull.addAll(amountStudentC);
        System.out.println("Total students: " + amountFull.size());
    }
}

