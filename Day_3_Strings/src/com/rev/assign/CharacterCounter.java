package com.rev.assign;

import java.util.Scanner;

public class CharacterCounter {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     
     
     System.out.print("Enter a string: ");
     String input = scanner.nextLine();
     
     scanner.close();
     
     
     int vowelCount = 0;
     int consonantCount = 0;
     int digitCount = 0;
     int whitespaceCount = 0;
     
    
     String lowerCaseInput = input.toLowerCase();
     
     
     for (char ch : lowerCaseInput.toCharArray()) {
         if (Character.isWhitespace(ch)) {
             whitespaceCount++;
         } else if (Character.isDigit(ch)) {
             digitCount++;
         } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             vowelCount++;
         } else if (Character.isLetter(ch)) {
             consonantCount++;
         }
     }
     
    
     System.out.println("Number of vowels: " + vowelCount);
     System.out.println("Number of consonants: " + consonantCount);
     System.out.println("Number of digits: " + digitCount);
     System.out.println("Number of whitespace characters: " + whitespaceCount);
 }

}

