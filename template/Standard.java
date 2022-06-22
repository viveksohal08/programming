package template;

import java.util.ArrayList;
import java.util.List;

public class Standard {

    public static void main(String[] args) {

        // Use m as number of rows and n as number of columns of matrix
        int m = 3;
        int n = 3;

        // Use matrix as name for declaring a 2D array
        int[][] matrix = new int[m][n];

        // Use list as name for declaring an ArrayList
        List<Integer> list = new ArrayList<>();

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        // List of lists
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(firstList);
        listOfLists.add(secondList);

        // Use arr as name for declaring an array
        int[] arr = new int[n];

        // Use rowIndList and colIndList to represent list of row and column indices respectively
        List<Integer> rowIndList = new ArrayList<>();
        List<Integer> colIndList = new ArrayList<>();

    }

}
