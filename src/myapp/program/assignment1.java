package myapp.program;

public class assignment1 {

	public static void main(String[] args) {
		/*
		//1.	Write a program to print "Hello, World!".
		System.out.println("Hello World");
		*/
		
		
		//2.	Write a program to take Name and Age as input and print them
		/*System.out.println("Enter name");
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine();
		System.out.println("Name= "+name);
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Age= "+age);
		
		*/
		
		//3.	Write a program to take User ID as input and print Jake's name & age if the ID matches.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user ID");
		String userId=sc.nextLine();
		
		if(userId.equals("jake123")) {
			System.out.println("Name: Jake");
			System.out.println("Age: 25");
		}else {
			System.out.println("user Id not valid");
		}
		*/
		
		//4.	Write a program to take Age as input, increment it by 1, and print the result.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		age++;
		System.out.println("Next year your age will: +age");
		*/
		
		//5.	Write a program to find and print the largest of three numbers.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is largest:"+a);
		}else if(b>a && b>c) {
			System.out.println("b is largest:"+b);
		}else {
			System.out.println("c is largest:"+c);
		}
		*/
		
		//6.	Write a program to add 2 and 3 and print the result.
		/*
		int result=2+3;
		System.out.println("sum is :"+result);
		*/
		
		//7.	Write a program to take two numbers as input, add them, and print the sum.
		/*
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();

	        int sum = num1 + num2;
	        System.out.println("Sum: " + sum);
	        */
		
		//8.	Write a program to take two numbers as input, multiply them, and print the result
	/*
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        int product = a * b;
	        System.out.println("Product: " + product);
	        */
		//9.	Write a program to take two numbers as input, subtract them, and print the difference.
	/*
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = a - b;
        System.out.println("Difference: " + diff);
        */
		
		//10.	Write a program to convert Fahrenheit to Celsius.
	
		/*
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius: " + celsius);
        */
		
		//11.	Write a program to find the Area and Circumference of a Circle.
		/*
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        */
	

	}

}
