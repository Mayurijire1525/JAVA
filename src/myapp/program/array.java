package myapp.program;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int sum = 0;
        int arr[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array elements = " + sum);

        sc.close();
    }
}
