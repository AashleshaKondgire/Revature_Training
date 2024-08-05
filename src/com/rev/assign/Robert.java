package com.rev.assign;

import java.util.Scanner;

public class Robert {
	double total;
public double TotalMarks(double sub1 , double sub2, double sub3) {
	total = sub1 + sub2 + sub3;
	return total;
}
public double calculatePercentage(double totalMarks, int maxMarks) {
    return (totalMarks / maxMarks) * 100;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the marks of Robert in subject 1 (out of 100): ");
    double subject1 = sc.nextDouble();

    System.out.print("Enter the marks of Robert in subject 2 (out of 100): ");
    double subject2 = sc.nextDouble();

    System.out.print("Enter the marks of Robert in subject 3 (out of 100): ");
    double subject3 = sc.nextDouble();
    
    Robert r = new Robert();

    
    double totalMarks = r.TotalMarks(subject1, subject2, subject3);

   
    double percentage = r.calculatePercentage(totalMarks, 300);

    
    System.out.println("Total marks: " + totalMarks);
    System.out.println("Percentage: " + percentage + "%");


}
}
