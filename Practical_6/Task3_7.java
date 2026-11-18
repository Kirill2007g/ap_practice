import java.util.Arrays;
import java.util.Scanner;


public class Task3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть розмір масиву N: ");
        int n = sc.nextInt();

        System.out.print("Введіть " + n + " цілих елементів через пробіли: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Масив: " + Arrays.toString(arr));

        boolean found = false;
        for (int i = 0; i < n; i++) {

            boolean seenBefore = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    seenBefore = true;
                    break;
                }
            }
            if (seenBefore) continue;

            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == arr[i]) count++;
            }
            if (count > 1) {
                System.out.println("Значення " + arr[i] + " зустрічається " + count + " разів");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Повторюваних значень немає.");
        }
    }
}
