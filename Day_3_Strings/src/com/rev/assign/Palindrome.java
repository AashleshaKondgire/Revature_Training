package com.rev.assign;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     
     
     System.out.print("Enter a string: ");
     String input = scanner.nextLine();
     
     
     scanner.close();
     
     
     String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
     
     
     boolean isPalindrome = isPalindrome(cleanedInput);
     
   
     if (isPalindrome) {
         System.out.println("The string \"" + input + "\" is a palindrome.");
     } else {
         System.out.println("The string \"" + input + "\" is not a palindrome.");
     }
 }
 
 
 public static boolean isPalindrome(String str) {
     int left = 0;
     int right = str.length() - 1;
     
     while (left < right) {
         if (str.charAt(left) != str.charAt(right)) {
             return false;
         }
         left++;
         right--;
     }
     
     return true;
}
}