package com.rev.assign;

public class GirlsWithGrade {
public static void main(String[] args) {
	int totalStudents = 90;
	int totalBoys = 45;
	int gradeAStudents = totalStudents/2;
	int gradeABoys = 20;
	
	int totalGirls = totalStudents - totalBoys;
	int gradeAGirls = gradeAStudents - gradeABoys;
	System.out.println("Total number of girls grade 'A': " + gradeAGirls);
}
}
