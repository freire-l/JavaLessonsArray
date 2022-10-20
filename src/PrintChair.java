import java.util.Scanner;

public class PrintChair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");

        int size = scanner.nextInt();

        if (size <= 0){
            System.out.println("Error, terminating program");
            System.exit(1);
        }
        int middle = Math.floorDiv(size,2);

        int[][] matrix = new int[size][size];

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if((j == 0)||(i == middle)||((j == size-1)&&(i>=middle))) matrix[i][j] = 1;
                else matrix[i][j] = 0;

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
