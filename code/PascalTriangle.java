package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<List<Integer>> listOfLists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> rowList = new ArrayList<>();
            if (i == 0) {
                rowList.add(1);
                listOfLists.add(rowList);
                continue;
            }
            if (i == 1) {
                rowList.add(1);
                rowList.add(1);
                listOfLists.add(rowList);
                continue;
            }
            rowList.add(1);
            for (int j = 0; j < listOfLists.get(i - 1).size() - 1; j++)
                rowList.add(listOfLists.get(i - 1).get(j) + listOfLists.get(i - 1).get(j + 1));
            rowList.add(1);
            listOfLists.add(rowList);
        }

        for (int i = 0; i < listOfLists.size(); i++) {
            for (int j = 0; j < listOfLists.get(i).size(); j++)
                System.out.print(listOfLists.get(i).get(j) + "\t");
            System.out.println();
        }

    }

}