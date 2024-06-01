package com.examples;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
	    int rev=0;
	    while(number!=0) {
	    	int rem=number%10;
	    	rev=rev*10+rem;
	    	number /=10;
	    }
	    System.out.println("Reverse of a number is"+rev);
	}
	

}
