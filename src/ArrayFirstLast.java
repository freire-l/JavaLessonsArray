import java.util.Scanner;

public class ArrayFirstLast {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Scanner scanner = new Scanner(System.in);

        // Get numbers from user
        for (int i = 0; i < numbers.length ; i++){
            System.out.print("Enter number " + i + " ");
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i < numbers.length/2; i++){
            System.out.println(numbers[numbers.length-1-i]);
            System.out.println(numbers[i]);
        }
    }
}
