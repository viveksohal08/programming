package template;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements for list: ");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        // List input
        System.out.println("Enter the elements of list: ");
        for (int i = 0; i < n; i++)
            list.add(scanner.nextInt());

        // List output
        System.out.println("The elements of list: ");
        for (int i = 0; i < n; i++)
            System.out.print(list.get(i) + "\t");
        System.out.println();

    }

}