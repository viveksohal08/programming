package template;

import java.util.Scanner;

public class ArrayReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements for array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        // Reversing the array
        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("The elements of array in reverse: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "\t");
        System.out.println();

    }

}