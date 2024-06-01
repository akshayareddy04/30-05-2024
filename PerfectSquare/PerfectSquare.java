package com.examples;

public class PerfectSquare {
	    public static void main(String[] args) {
	        // Input number
	        int number = 9;

	        // Check if the number is a perfect square
	        boolean isPerfectSquare = isPerfectSquare(number);

	        // Print the result
	        System.out.println(isPerfectSquare);
	    }

	    public static boolean isPerfectSquare(int number) {
	        // Edge case: If the number is less than 0, it's not a perfect square
	        if (number < 0) {
	            return false;
	        }

	        // Calculate the square root of the number
	        int sqrt = (int) Math.sqrt(number);

	        // Check if the square root multiplied by itself equals the number
	        return sqrt * sqrt == number;
	    }
	}

