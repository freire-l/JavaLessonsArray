import java.util.Scanner;

public class PrintX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");

        int size = scanner.nextInt();

        if (size <= 0){
            System.out.println("Error, terminating program");
            System.exit(1);
        }

        char[][] matrix = new char[size][size];

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if((j == i) || (j == (matrix[i].length-1-i))) matrix[i][j] = 'x';
                else matrix[i][j] = '_';

            }
        }
        //Print matrix
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
