import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть розмір масиву N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(101) - 50;
        }
        System.out.println("Масив до модифікації: " + Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = Math.abs(arr[i]);
            }
        }
        System.out.println("Масив після модифікації: " + Arrays.toString(arr));
    }
}
