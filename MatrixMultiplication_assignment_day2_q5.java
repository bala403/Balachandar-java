import java.util.*;
class MatrixMultiplication_assignment_day2_q5
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int cols1 = scanner.nextInt();
        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int cols2 = scanner.nextInt();
        if (cols1 != rows2) 
        {
            System.out.println("Error: Number of columns of the first matrix must be equal to the number of rows of the second matrix.");
        }
        else 
        {
            System.out.println("Enter the elements of the first matrix:");
            int[][] matrix1 = readMatrix(scanner, rows1, cols1);
            System.out.println("Enter the elements of the second matrix:");
            int[][] matrix2 = readMatrix(scanner, rows2, cols2);
            int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
            System.out.println("Resultant Matrix:");
            printMatrix(resultMatrix);
        }
    }
    private static int[][] readMatrix(Scanner scanner, int rows, int cols) 
    {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) 
            {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2)
     {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] resultMatrix = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) 
        {
            for (int j = 0; j < cols2; j++) 
            {
                for (int k = 0; k < cols1; k++) 
                {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }
    private static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int num : row) 
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}