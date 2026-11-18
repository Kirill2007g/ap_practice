import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть розмір масиву N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(201) - 100;
        }
        System.out.println("Початковий масив: " + Arrays.toString(arr));

        int sumPos = 0;
        int sumNeg = 0;
        for (int x : arr) {
            if (x > 0) sumPos += x;
            else if (x < 0) sumNeg += x;
        }
        System.out.println("Сума додатних елементів: " + sumPos);
        System.out.println("Сума від'ємних елементів: " + sumNeg);

        int absNeg = Math.abs(sumNeg);
        if (sumPos > absNeg) {
            System.out.println("За абсолютним значенням більша сума додатних (" + sumPos + " > " + absNeg + ")");
        } else if (absNeg > sumPos) {
            System.out.println("За абсолютним значенням більша сума від'ємних (" + absNeg + " > " + sumPos + ")");
        } else {
            System.out.println("Суми рівні за абсолютним значенням (" + sumPos + ")");
        }
    }
}
