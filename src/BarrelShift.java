public class BarrelShift {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int aux = numbers[numbers.length-1];

        for (int i = numbers.length-1; i >= 1; i--){
            numbers[i] = numbers[i-1];
        }
        numbers[0] = aux;

        for (int number:numbers) {
            System.out.println(number+" ");

        }
    }
}
