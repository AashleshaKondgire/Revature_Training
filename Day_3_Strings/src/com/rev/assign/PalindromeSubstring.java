package com.rev.assign;

public class PalindromeSubstring {
public static void main(String[] args) {
	 String input = "bob has a radar plane";
     
     String result = replacePalindromesWithAsterisks(input);
     
     
     System.out.println(result);
 }
 
 
 public static String replacePalindromesWithAsterisks(String input) {
     String[] words = input.split(" ");
     StringBuilder result = new StringBuilder();
     
     for (String word : words) {
         String modifiedWord = replacePalindromeInWord(word);
         result.append(modifiedWord).append(" ");
     }
     
     return result.toString().trim();
 }
 
 
 private static String replacePalindromeInWord(String word) {
     StringBuilder modifiedWord = new StringBuilder(word);
     
     for (int length = 2; length <= word.length(); length++) {
         for (int start = 0; start <= word.length() - length; start++) {
             String substring = word.substring(start, start + length);
             if (isPalindrome(substring)) {
                 String replacement = "*".repeat(length);
                 modifiedWord.replace(start, start + length, replacement);
             }
         }
     }
     
     return modifiedWord.toString();
 }
 
 
 private static boolean isPalindrome(String str) {
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
