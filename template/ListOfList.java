package template;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements for first list: ");
        int m = scanner.nextInt();

        List<Integer> firstList = new ArrayList<>();
        System.out.println("Enter the elements of first list: ");
        for (int i = 0; i < m; i++)
            firstList.add(scanner.nextInt());

        System.out.println("The elements of first list: ");
        for (int i = 0; i < m; i++)
            System.out.print(firstList.get(i) + "\t");
        System.out.println();

        System.out.println("Enter the number of elements for second list: ");
        int n = scanner.nextInt();

        List<Integer> secondList = new ArrayList<>();
        System.out.println("Enter the elements of second list: ");
        for (int i = 0; i < n; i++)
            secondList.add(scanner.nextInt());

        System.out.println("The elements of second list: ");
        for (int i = 0; i < n; i++)
            System.out.print(secondList.get(i) + "\t");
        System.out.println();

        // List of lists creation
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(firstList);
        listOfLists.add(secondList);

        // List of lists output
        System.out.println("The elements of list of lists: ");
        for (int i = 0; i < listOfLists.size(); i++) {
            for (int j = 0; j < listOfLists.get(i).size(); j++)
                System.out.print(listOfLists.get(i).get(j) + "\t");
            System.out.println();
        }

    }

}