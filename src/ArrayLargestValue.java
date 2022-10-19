import java.util.Scanner;

public class ArrayLargestValue {
    public static void main(String[] args) {
        
        int[] numbers = new int[7];

        Scanner scanner = new Scanner(System.in);
        
        boolean flag = false;
        
        int largest = 0;
        
        // Get numbers from user
        for (int i = 0; i < numbers.length ; i++){
            while(flag == false){
                System.out.print("Enter number " + i + " ");
                numbers[i] = scanner.nextInt();  
                if(numbers[i] >= 11 && numbers[i] <= 99) flag = true;
            }
            flag = false;
        }

        for (int number: numbers) {
            largest = (number > largest) ? number : largest;
        }

        System.out.println("largest = " + largest);
    }
}
