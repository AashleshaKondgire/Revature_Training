package com.rev.assign;

public class CheckLetter {
public static void main(String[] args) {
	String word = "Umbrella";
   
    char letterToFind = 'e';
    
    
    String lowerCaseWord = word.toLowerCase();
    char lowerCaseLetterToFind = Character.toLowerCase(letterToFind);
    
    
    boolean isPresent = lowerCaseWord.indexOf(lowerCaseLetterToFind) != -1;
    
   
    if (isPresent) {
        System.out.println("The letter '" + letterToFind + "' is present in the word '" + word + "'.");
    } else {
        System.out.println("The letter '" + letterToFind + "' is not present in the word '" + word + "'.");
    }
}
}

