package com.rev.assign;

import java.util.Scanner;

public class SubString {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    
    System.out.print("Enter the sentence: ");
    String sentence = scanner.nextLine();
    
    
    System.out.print("Enter the substring to replace: ");
    String oldSubstring = scanner.nextLine();
    
   
    System.out.print("Enter the replacement string: ");
    String newSubstring = scanner.nextLine();
    
    
    
    
    String newSentence = sentence.replace(oldSubstring, newSubstring);
    
   
    System.out.println("New sentence: " + newSentence);
}
}
