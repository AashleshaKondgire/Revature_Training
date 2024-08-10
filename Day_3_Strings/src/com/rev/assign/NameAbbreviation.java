package com.rev.assign;

import java.util.Scanner;

public class NameAbbreviation {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     
     
     System.out.print("Enter your full name: ");
     String fullName = scanner.nextLine();
     
     
     scanner.close();
     
     
     String[] nameParts = fullName.split(" ");
     
     
     if (nameParts.length < 3) {
         System.out.println("Please enter a full name with at least three parts (First Middle Last).");
         return;
     }
     
     
     String firstName = nameParts[0];
     String middleName = nameParts[1];
     String lastName = nameParts[nameParts.length - 1];
     
     
     String firstInitial = firstName.substring(0, 1).toUpperCase();
     String middleInitial = middleName.substring(0, 1).toUpperCase();
     
     
     String abbreviatedName = firstInitial + "." + middleInitial + "." + lastName;
     System.out.println("Abbreviated name: " + abbreviatedName);
 }
}


