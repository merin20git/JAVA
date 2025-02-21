import java.util.Scanner;

class MatrixAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions for the first matrix
        System.out.print("Enter number of rows for first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns for first matrix: ");
        int cols1 = sc.nextInt();

        // Input matrix dimensions for the second matrix
        System.out.print("Enter number of rows for second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int cols2 = sc.nextInt();

        // Check if both matrices have the same number of rows and columns
        if (rows1 == rows2 && cols1 == cols2) {
            // Declare matrices
            int[][] matrix1 = new int[rows1][cols1];
            int[][] matrix2 = new int[rows2][cols2];
            int[][] resultMatrix = new int[rows1][cols1];

            // Input elements for first matrix
            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                   // System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matrix1[i][j] = sc.nextInt();
                }
            }

            // Input elements for second matrix
            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    //System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matrix2[i][j] = sc.nextInt();
                }
            }

            // Add the matrices
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols

