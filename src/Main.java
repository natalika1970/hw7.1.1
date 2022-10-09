import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
    }

    private static int[] arr() {
        return new int[30];
    };
    public static int[] generateRandomArray() {

        Random random = new Random();

        int[] arr = arr();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        /*for (int index = 0; index < arr.length; index++) {
            if (index == arr.length -1){
                System.out.println(arr[index]);
                break;
            }
            System.out.println((arr[index]+ " "));
        }*/
        return arr;
    }
}
