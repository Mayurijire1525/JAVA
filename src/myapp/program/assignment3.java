package myapp.program;

import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		//1. Write a program to find the largest element in an array.
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the size");
//		int size=sc.nextInt();
//		int arr[]= new int[size];
//		
//		System.out.println("Enter the elements");
//		for(int i=0; i<size; i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.print("Array elements are=");
//		for(int i=0; i<size; i++) {
//			System.out.print(arr[i]+" ");
//		}
//
//		System.out.println();
//		
//		int max=arr[0];
//		
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println("Maximum element is= "+max);
		
		//2.. Write a program to calculate the sum of all elements in an array
//		Scanner sc=new Scanner(System.in);
//		int sum=0;
//		
//		System.out.println("Enter the size");
//		int size=sc.nextInt();
//		int arr[]= new int[size];
//		
//		System.out.println("Enter the elements");
//		for(int i=0; i<size; i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.print("Array elements are = ");
//		for(int i=0; i<size; i++) {
//			sum=sum+arr[i];
//			System.out.print(arr[i]+" ");
//			
//		}
//
//		System.out.println();
//		System.out.println("Sum of Array is = "+sum);
		
		//3.. Write a program to reverse an array
//		Scanner sc=new Scanner(System.in);
//		
//		
//		System.out.println("Enter the size");
//		int size=sc.nextInt();
//		int arr[]= new int[size];
//		
//		System.out.println("Enter the elements");
//		for(int i=0; i<size; i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.print("Array elements are = ");
//		for(int i=0; i<size; i++) {
//			
//			System.out.print(arr[i]+" ");
//			
//		}
//		System.out.println();
//		
//		System.out.print("Reversed Array = ");
//		for(int i=arr.length-1; i>=0; i--) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		
		
		//4. Write a program to find the smallest element in an array
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the size");
//		int size=sc.nextInt();
//		int arr[]= new int[size];
//		
//		System.out.println("Enter the elements");
//		for(int i=0; i<size; i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.print("Array elements are=");
//		for(int i=0; i<size; i++) {
//			System.out.print(arr[i]+" ");
//		}
//
//		System.out.println();
//		
//		int min=arr[0];
//		
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		System.out.println("Maximum element is= "+min);
		
		
		//5. Write a program to count even and odd numbers in an array
//		System.out.print("Even numbers =");
//		for(int i=0; i<=100; i+=2 ) {
//			System.out.print(i+" ");
//		}
//		
//		System.out.println();
//		System.out.print("Odd numbers =");
//		for(int i=1; i<=100; i+=2) {
//			System.out.print(i+" ");
//		}

	//6. Write a program to copy one array to another
		
//		int orarr[]= {1,2,3,4,5};
//		
//		int cparr[]=new int[orarr.length];
//		
//		for(int i=0; i<orarr.length; i++) {
//			cparr[i]=orarr[i];
//		}
//	
//		System.out.print("Copied array=");
//		for(int i=0; i<cparr.length; i++) {
//			System.out.print(cparr[i]+" ");
//		}
//	    System.out.println();
		
		
		//7. Write a program to sort an array in ascending order
		
//		int arr[]= {2,4,5,6,7,8};
//		
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=0; j<arr.length-1-i; j++) {
//				
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		System.out.print("Sorted Array=");
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		//8. Write a program to search for an element in an array
//		
//		Scanner sc=new Scanner(System.in);
//		
//		int arr[]= {10,20,30,40,50};
//		System.out.println("Enter element to search");
//		int search=sc.nextInt();
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]==search) {
//				System.out.println(search+" Element is present in the array");
//				
//			}else {
//				System.out.println("Not found");
//			}
//		}
		
		//9.Write a program to merge two arrays.
		
//		int arr[]= {1,2,3,4};
//		
//		int arr2[]= {5,6,7,8};
//		
//		int length1=arr.length;
//		int length2=arr2.length;
//		
//		int marr[]=new int[length1+length2];
//		
//		
//			
//			for(int i=0; i<length1; i++) {
//				marr[i]=arr[i];	
//			}
//		
//		    for(int i=0; i<length2; i++) {
//		    	marr[length1+i]=arr2[i];
//		    }
//		    System.out.println("Merged array");
//		    for(int num:marr) {
//		    	System.out.print(num+" ");
//		    }
		
		//10. Write a program to remove duplicate elements from an array
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the size of array");
//		int size=sc.nextInt();
//		int arr[]=new int[size];
//		
//		System.out.println("Enter the elements of array");
//		for(int i=0; i<size; i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		System.out.print("Array elements are ");
//		for(int i=0; i<size; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		
//		int temp[]=new int[size];
//		int j=0;
//		
//		for(int i=0; i<size; i++) {
//			boolean dupl=false;
//			
//			for(int k=0; k<j; k++) {
//				if(arr[i]==temp[k]) {
//					dupl=true;
//					break;
//				}
//			}
//			
//			if(!dupl) {
//				temp[j]=arr[i];
//				j++;
//			}
//		}
//		System.out.println();
//		System.out.print("Array after removing");
//		for(int i=0; i<j; i++) {
//			System.out.print(temp[i]+" ");
//		}
		
		
		
/////////////////////////STRING////////////////////////////////////////////////////////////
		
		//1. Write a program to find the length of a string
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter a string");
//		String str=sc.nextLine();
//		
//		int count=0;
//		
//		for(int s=0; s<str.length(); s++) {
//			count++;
//		}
//		System.out.println("Count="+count);
		
		//2. Write a program to count the number of vowels and consonants in a string
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter string");
//		String str=sc.nextLine();
//		
//		int vow=0,con=0;
//		
//		for(int i=0; i<str.length(); i++) {
//			char ch=str.charAt(i);
//			
//			if(ch>='a'||ch>='A' && ch<='Z'||ch<='z') {
//				if(ch=='a'||ch=='A'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||
//						ch=='O'||ch=='o'||ch=='U'||ch=='u') {
//					vow++;
//				
//				
//			}else{
//				con++;
//			}
//			}
//					
//	}
//		System.out.println("Number of vowels="+vow);
//		System.out.println("Number of consonants="+con);
		
		
		//3.. Write a program to reverse a string
		

//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter string");
//		String str=sc.nextLine();
//		String rev="";
//		System.out.println(str);
//
//		for(int i=str.length()-1; i>=0; i--) {
//			rev=rev+str.charAt(i);
//		}
//		System.out.println("Reversed String="+rev);
		
		//4. Write a program to check if a string is a palindrome.
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter a string");
//		String str=sc.nextLine();
//		
//		int start=0;
//		int end=str.length()-1;
//		boolean palindrome=true;
//		
//		while(start<end) {
//			if(str.charAt(start)!=str.charAt(end)) {
//				palindrome=false;
//				break;
//			}
//			start++;
//			end--;
//		}
//		if(palindrome) {
//			System.out.println("The string is  a palindrome");
//		}else {
//			System.out.println("The string is not a palindrome");
//		}
		
		//5.Write a program to convert lowercase letters to uppercase in a string.
	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string");
//		String str=sc.nextLine();
//		
//		char[] chars=str.toCharArray();
//		
//		for(int i=0; i<chars.length; i++) {
//			if(chars[i]>='a' && chars[i]<='z') {
//				chars[i]=(char)(chars[i]-32);
//			}
//		}
//		System.out.println("Uppercase String");
//		for(int i=0; i<chars.length; i++) {
//			System.out.print(chars[i]);
//		}
		
		//6. Write a program to count the frequency of characters in a string
		//7. Write a program to remove all white spaces from a string
		//8. Write a program to compare two strings.
		
		
//		        Scanner scanner = new Scanner(System.in);
//
//		       
//		        System.out.print("Enter first string: ");
//		        String str1 = scanner.nextLine();
//
//		        System.out.print("Enter second string: ");
//		        String str2 = scanner.nextLine();
//
//		       
//		        if (str1.equals(str2)) {
//		            System.out.println("Both strings are equal.");
//		        } else {
//		            System.out.println("Strings are not equal.");
//		        }
//
//		       
//		        int result = str1.compareTo(str2);
//		        if (result == 0) {
//		            System.out.println("Using compareTo: Both strings are equal.");
//		        } else if (result < 0) {
//		            System.out.println("Using compareTo: First string is less than second string.");
//		        } else {
//		            System.out.println("Using compareTo: First string is greater than second string.");
//		        }
		

		     
		    
		

		//9. Write a program to find the first non-repeated character in a string
		//10. Write a program to replace all occurrences of a character in a string
//		
//		        String str = "hello world";
//		        char oldChar = 'l';
//		        char newChar = 'x';
//
//		        char[] chars = str.toCharArray();
//		        for (int i = 0; i < chars.length; i++) {
//		            if (chars[i] == oldChar) {
//		                chars[i] = newChar;
//		            }
//		        }
//
//		        // Print the new string
//		        System.out.print("String after replacement: ");
//		        for (int i = 0; i < chars.length; i++) {
//		            System.out.print(chars[i]);
//		        }
		    
		

	}
}
