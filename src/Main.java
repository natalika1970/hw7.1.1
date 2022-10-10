import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Random;

 public class Main {


    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int[] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));
        return 0;
    }


    public static int[] generateRandomArray() {

        Random random = new Random();

        int[] arr = arr();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }
    public static int[] expenses() {
        System.out.println("задание 1 ");
        int sum = 0;

        int[] expenses = new expenses[0];
        for (int expense : expenses) {
            sum += expense;
        }
        System.out.println("сумма трат за месяц составила" + sum + " рублей");

        System.out.println("задание 2 ");
        int max = Integer.MIN_VALUE;
        int mix = Integer.MAX_VALUE;
        int min = 0;
        for (int expense : expenses) {
            if (expense > max) {
                max = expense;
            }
            min = 0;
            if (expense < min) {
                min = expense;
            }
        }
        System.out.println("максимальная сумма трат за день составила " + min);
        System.out.println("минимальная сумма трат за день составила " + max);
        return new int[0];
    }

     System.out.println("задание 3 ");
    double averageExpense = (double) i / expenses.length;
      System.out.println("средняя сумма трат за месяц составила" + averageExpense + " рублей");


       System.out.println("задание 4 ");
    char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
              for (int i = reverseFullName.length - 1; i >= 0; i--) {
        System.out.println(reverseFullName[i]);
    }


}
