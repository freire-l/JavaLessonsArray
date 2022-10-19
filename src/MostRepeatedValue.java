import java.util.Scanner;

public class MostRepeatedValue {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Scanner scanner = new Scanner(System.in);

        boolean flag = false;

        int largest = 0;

        // Get numbers from user
        for (int i = 0; i < numbers.length ; i++){
            while(flag == false){
                System.out.print("Enter number " + i + " ");
                numbers[i] = scanner.nextInt();
                if(numbers[i] >= 1 && numbers[i] <= 9) flag = true;
            }
            flag = false;
        }

        int[] hashes = new int[9];

        for (int number: numbers) {
            hashes[number-1]++;
        }

        int index = 0;
        for (int i = 0; i < hashes.length; i++) {
            if(hashes[i]>largest){
                index = i+1;
                largest = hashes[i];
            }
        }

        System.out.println("Most occurrences = " + largest);
        System.out.println("Most repeated element is = " + index);


    }
}
