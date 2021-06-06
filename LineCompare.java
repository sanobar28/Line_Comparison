/**
 * 
 * @author Sanobar Mujawar
 * @Created_on: 06.06.21
 * 
 * purpose: Line comparison program to compare length of two lines with co-ordinates. 
 * 
 * 
 */

package com;

import java.util.*;

public class LineCompare {

	public static void main(String[] args) {
		
		 System.out.println("Welcome to line comparison computation");	
		 calculateLength();
	}
	
	/**
	 * UC-1 to calculate length of two lines 
	 */
	
	private static void calculateLength() {
		
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the first co-ordinate of x of line 1");
	        int x1 = scanner.nextInt();
	        System.out.println("Enter the first co-ordinate of y of line 1");
	        int y1 = scanner.nextInt();
	        System.out.println("Enter the second co-ordinate of x of line 1");
	        int x2 = scanner.nextInt();
	        System.out.println("Enter the second co-ordinate of y of line 1");
	        int y2 = scanner.nextInt();
	
	        Integer lengthOfLine1 = (int) Math.sqrt((Math.pow((x2 - x1) , 2 )+Math.pow((y2 - y1) , 2 )));
	        System.out.println("The length of line 1 is : " +lengthOfLine1);
	        
	        System.out.println("Enter the first co-ordinate of x of line 2");
	        int X1 = scanner.nextInt();
	        System.out.println("Enter the first co-ordinate of y of line 2");
	        int Y1 = scanner.nextInt();
	        System.out.println("Enter the second co-ordinate of x of line 2");
	        int X2 = scanner.nextInt();
	        System.out.println("Enter the second co-ordinate of y of line 2");
	        int Y2 = scanner.nextInt();
	
	        Integer lengthOfLine2=  (int) Math.sqrt((Math.pow((X2 - X1) , 2 ) + Math.pow((Y2 - Y1) , 2 )));
	        System.out.println("The length of line 2 is :  " +lengthOfLine2);
		
	        Equals(lengthOfLine1, lengthOfLine2);
	        scanner.close();
	}
	
	/**
	 * UC-2 to check of lines are equal using .equals
	 * @param lengthOfLine1
	 * @param lengthOfLine
	 */
	
	public static void Equals(Integer lengthOfLine1, Integer lengthOfLine2) {
		
		if (lengthOfLine1.equals(lengthOfLine2)){
			  System.out.println("Both Lengths are equals");
		 }
		 else{
			  System.out.println(" Lengths are not equals");
		 }
	}
}
