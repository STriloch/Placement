import java.util.*;

public class Sortmatrix {
    public static void sortMatrix(int[][] matrix) {
        int[] temp = new int[matrix.length * matrix[0].length];
        int k = 0;
        
        for (int[] row : matrix) {
            for (int num : row) {
                temp[k++] = num;
            }
        }
         
        Arrays.sort(temp);
        
        k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = temp[k++];
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {5, 4, 7},
            {1, 8, 3},
            {9, 6, 2}
        };
        
        sortMatrix(matrix);
        System.out.println("Sorted Matrix:");
        printMatrix(matrix);
    }
}
