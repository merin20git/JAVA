public class MatrixAddition {

    public static void main(String[] args) {
        // Define two 2x2 matrices with predefined values
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        
        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };
        
        // Declare a result matrix to store the sum
        int[][] result = new int[2][2];
        
        // Perform matrix addition
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Display the result matrix
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

