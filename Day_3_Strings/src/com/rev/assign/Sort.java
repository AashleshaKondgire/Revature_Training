package com.rev.assign;

import java.util.Arrays;

public class Sort {
public static void main(String[] args) {
	 String[] friends = {
	            "Ash", "Tejas", "Ashu", "Raj", "Siya",
	            "Riya", "Ankit", "Shreya", "Ishita", "Joy"
	        };
	        
	      
	        System.out.println("Friends' names before sorting:");
	        for (String friend : friends) {
	            System.out.println(friend);
	        }
	        
	        
	        Arrays.sort(friends);
	        
	     
	        System.out.println("\nFriends' names after sorting:");
	        for (String friend : friends) {
	            System.out.println(friend);
	        }
}
}
