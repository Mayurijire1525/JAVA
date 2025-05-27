package myapp.program;

import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		//1.	WAP to check if a number is even or odd.
//		Scanner sc=new Scanner(System.in);
//	
//		
//		System.out.println("Enter number");
//		int num=sc.nextInt();
//		
//		if(num%2==0) {
//			System.out.println(num+" is even");
//		}else {
//			System.out.println(num+" is odd");
//		}

		
		//2.	WAP to check if a number is prime or not.
//		3.	WAP to print numbers from 1 to 20.
		
		
//		for(int i=1; i<=20; i++) {
//			System.out.println(i+" ");
//		}
//		4.	WAP to print numbers from 1 to 10, excluding 5 and 6.
//		for(int i=1; i<=10; i++) {
//			if(i==5||i==6) {
//				continue;
//			}
//			System.out.print(i+" ");
//		}
//		5.	WAP to print the table of 5.
//		
//		System.out.println("Table of 5");
//		for(int i=1; i<=10; i++) {
//			System.out.println(i+"*5="+i*5);
//		}
//		6.	WAP to print "Hello" five times.
//		for(int i=1; i<=5; i++) {
//		System.out.println("Hello");
//		}
//		7.	WAP to print any multiplication table for a given number.
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number for multiplication");
//		int num=sc.nextInt();
//		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i + " * " + num + " = " + (i * num));
//		}
		
//		8.	WAP to print the reverse of 1234.
	
//		        Scanner sc = new Scanner(System.in);
//		        System.out.print("Enter a number to reverse: ");
//		        int num = sc.nextInt();
//		        int reversed = 0;
//
//		        while (num != 0) {
//		            int digit = num % 10;        
//		            reversed = reversed * 10 + digit; 
//		            num = num / 10;              
//		        }
//
//		        System.out.println("Reversed number: " + reversed);
//		       
		    
		

//		9.	WAP to check if 121 is a palindrome.
		
//		        Scanner sc = new Scanner(System.in);
//		        System.out.print("Enter a number to check for palindrome: ");
//		        int num = sc.nextInt();
//
//		        int original = num;
//		        int reversed = 0;
//
//		        while (num != 0) {
//		            int digit = num % 10;
//		            reversed = reversed * 10 + digit;
//		            num = num / 10;
//		        }
//
//		        if (original == reversed) {
//		            System.out.println(original + " is a palindrome.");
//		        } else {
//		            System.out.println(original + " is not a palindrome.");
//		        }

		

		

//		11.	WAP to check if 153 is an Armstrong number.
		
//		        Scanner sc = new Scanner(System.in);
//		        System.out.print("Enter a number to check for Armstrong: ");
//		        int num = sc.nextInt();
//		        int original = num;
//		        int sum = 0;
//
//		        while (num != 0) {
//		            int digit = num % 10;
//		            sum += digit * digit * digit;  // Cube of each digit
//		            num = num / 10;
//		        }
//
//		        if (sum == original) {
//		            System.out.println(original + " is an Armstrong number.");
//		        } else {
//		            System.out.println(original + " is not an Armstrong number.");
//		        }

		        
//		13.	WAP to print all Armstrong numbers from 1 to 1000.
		
//		        System.out.println("Armstrong numbers from 1 to 1000 are:");
//
//		        for (int num = 1; num <= 1000; num++) {
//		            int original = num;
//		            int sum = 0;
//		            int temp = num;
//
//		            while (temp != 0) {
//		                int digit = temp % 10;
//		                sum += digit * digit * digit;
//		                temp = temp / 10;
//		            }
//
//		            if (sum == original) {
//		                System.out.println(original);
//		            }
//		        }
		    
		

//		14.	WAP to print all palindrome numbers from 1 to 100.
		
//		        System.out.println("Palindrome numbers from 1 to 100 are:");
//
//		        for (int num = 1; num <= 100; num++) {
//		            int original = num;
//		            int reversed = 0;
//		            int temp = num;
//
//		            while (temp != 0) {
//		                int digit = temp % 10;
//		                reversed = reversed * 10 + digit;
//		                temp = temp / 10;
//		            }
//
//		            if (original == reversed) {
//		                System.out.println(original);
//		            }
//		        }
		    

	}

}
