package code;

import java.util.Scanner;

public class MaximumSubarraySum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements for array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements for array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        int max = -10000, sum = 0, startInd = 0, endInd = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                    startInd = i;
                    endInd = j;
                }
            }
        }

        System.out.println("Maximum sum of subarray is: " + max + " from index " + startInd + " to " + endInd);

    }

}