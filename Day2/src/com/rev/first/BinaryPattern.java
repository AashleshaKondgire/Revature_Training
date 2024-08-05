package com.rev.first;

public class BinaryPattern {
	public static void main(String[] args) {
        int n = 7;
        int spaces = 0; 

        for (int i = n; i >= 1; i -= 2) {
            
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

           
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

           
            System.out.println();
            spaces++;
        }
    }

}
