import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        
        int[] numbers = new int[7];

        Scanner scanner = new Scanner(System.in);
        
        boolean flag = false;
        
        int totalNegative = 0;
        int countNegative = 0;
        int totalPositive = 0;
        int countPositive = 0;
        int countZero = 0;
        
        // Get numbers from user
        for (int i = 0; i < numbers.length ; i++){
            System.out.print("Enter number " + i + " ");
            numbers[i] = scanner.nextInt();
        }

        for (int number: numbers) {
            if(Integer.signum(number) == -1) {
                totalNegative += Math.abs(number);
                countNegative++;
            }
            else if (Integer.signum(number) == 1) {
                totalPositive += Math.abs(number);
                countPositive++;
            }
            else countZero ++;
        }

        System.out.println("Avg Negative = " + (-totalNegative/countNegative));
        System.out.println("Avg Positive = " + (totalPositive/countPositive));
        System.out.println("Zeros Count = " + (countZero));
    }
}
