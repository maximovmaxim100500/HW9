import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println(" ");
        System.out.println("Задача 2");
        int maxSum = -1;
        int minSum = 200_001;
        for (int element : arr) {
            if (element > maxSum) {
                maxSum = element;
            }
            if (element < minSum) {
                minSum = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. " +
                "Максимальная сумма трат за день составила " + maxSum + " рублей.");

        System.out.println(" ");
        System.out.println("Задача 3");
        var averageSum = (float) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");

        System.out.println(" ");
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}