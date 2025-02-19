import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter the elements of a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nThe 3x3 matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}