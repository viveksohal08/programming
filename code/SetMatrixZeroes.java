package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetMatrixZeroes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = scanner.nextInt();

        List<Integer> rowIndList = new ArrayList<>();
        List<Integer> colIndList = new ArrayList<>();

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (matrix[i][j] == 0) {
                    rowIndList.add(i);
                    colIndList.add(j);
                }

        for (int i = 0; i < rowIndList.size(); i++)
            for (int j = 0; j < n; j++)
                matrix[rowIndList.get(i)][j] = 0;

        for (int j = 0; j < colIndList.size(); j++)
            for (int i = 0; i < m; i++)
                matrix[i][colIndList.get(j)] = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();

        }

    }

}