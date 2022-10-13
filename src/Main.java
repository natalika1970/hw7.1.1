import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Random;

 public class Main {


    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int[] expenses = getExpenses(arr);
        System.out.println(Arrays.toString(expenses));
        averageExpense(arr);
    }


    public static int[] generateRandomArray() {

        Random random = new Random();

        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }
    public static int[] getExpenses(int[] arr) {
        System.out.println("задание 1 ");
        int sum = 0;

        int[] expenses = arr;
        for (int expense : expenses) {
            sum += expense;
        }
        System.out.println("сумма трат за месяц составила" + sum + " рублей");

        System.out.println("задание 2 ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int expense : expenses) {
            if (expense > max) {
                max = expense;
            }
            if (expense < min) {
                min = expense;
            }
        }
        System.out.println("максимальная сумма трат за день составила " + max);
        System.out.println("минимальная сумма трат за день составила " + min);
        return expenses;
    }

     public static int averageExpense(int[] arr) {
         System.out.println("задание 3 ");

         int[] arrayOfPurchases = arr;
         int sum = 0;
         for (int i = 0; i < arrayOfPurchases.length; i++) {
             sum = sum + arrayOfPurchases[i];
         }
         int averagePurchasesSum = sum / arrayOfPurchases.length;
         System.out.println("средняя сумма трат за месяц составила " + (double) averagePurchasesSum + " рублей");
         return averagePurchasesSum;
     }

     //      System.out.println("задание 4 ");
  // char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    //         for (int i = reverseFullName.length - 1; i >= 0; i--) {
    //   System.out.println(reverseFullName[i]);
  //  }


}
