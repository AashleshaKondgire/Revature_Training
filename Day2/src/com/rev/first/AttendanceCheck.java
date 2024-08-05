package com.rev.first;

import java.util.Scanner;
public class AttendanceCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();

    
        double attendancePercentage = ((double) classesAttended / classesHeld) * 100;

        
        System.out.println("Attendance percentage: " + attendancePercentage + "%");

       
        if (attendancePercentage >= 75) {
            System.out.println("You are allowed to sit in the exam.");
        } else {
            
            System.out.print("Do you have a medical cause? (Y/N): ");
            char medicalCause = scanner.next().charAt(0);

            if (medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("You are allowed to sit in the exam due to medical cause.");
            } else {
                System.out.println("You are not allowed to sit in the exam.");
            }
        }

        
    }
}
