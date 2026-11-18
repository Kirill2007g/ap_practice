import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть розмір масиву N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(11) - 5;
        }
        System.out.println("Початковий масив: " + Arrays.toString(arr));

        int count = 0;
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
                if (first == -1) first = i;
                last = i;
            }
        }

        if (count == 0) {
            System.out.println("Нульових елементів у масиві немає.");
        } else {
            System.out.println("Кількість нульових елементів: " + count);
            System.out.println("Індекс першого нульового елемента: " + first);
            System.out.println("Індекс останнього нульового елемента: " + last);
        }
    }
}
