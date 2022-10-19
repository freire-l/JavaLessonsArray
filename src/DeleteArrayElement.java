import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] numbers2 = new int[9];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter position between 0-9");

        int position = scanner.nextInt();

        int aux = numbers[numbers.length-1];

        for (int i = position; i <= numbers.length-2; i++){
            numbers[i] = numbers[i+1];
        }

        for (int number:numbers) {
            System.out.println(number+" ");

        }

        //copying
        System.arraycopy(numbers,0,numbers2,0,numbers2.length);

        for (int number:numbers2) {
            System.out.println(number+" ");

        }
    }
}
