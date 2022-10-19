import java.util.Scanner;

public class ArrayHistogram {
    public static void main(String[] args) {
        int[] numbers = new int[12];

        Scanner scanner = new Scanner(System.in);

        boolean flag = false;

        int largest = 0;

        // Get numbers from user
        for (int i = 0; i < numbers.length ; i++){
            while(flag == false){
                System.out.print("Enter number " + i + " ");
                numbers[i] = scanner.nextInt();
                if(numbers[i] >= 1 && numbers[i] <= 6) flag = true;
            }
            flag = false;
        }

        int[] hashes = new int[6];

        for (int number: numbers) {
            hashes[number-1]++;
        }

        int index = 0;
        String ast= "*";
        for (int i = 0; i < hashes.length; i++) {
            System.out.println(i + " | " + (ast.repeat(hashes[i])));
        }


    }
}
