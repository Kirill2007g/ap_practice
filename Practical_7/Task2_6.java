import java.util.Random;
import java.util.Scanner;

public class Task2_6 {
    static void print(int[][] a) {
        for (int[] row : a) {
            StringBuilder sb = new StringBuilder();
            for (int v : row) {
                sb.append(String.format("%5d", v));
            }
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        System.out.println("Практична робота №7");
        System.out.println("Виконав здобувач освіти: Кирило Коробейко");
        System.out.println("Варіант: 21");
        System.out.println("Завдання 2.6");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть M: ");
        int m = sc.nextInt();
        System.out.print("Введіть N: ");
        int n = sc.nextInt();
        if (m <= 0 || n <= 0) {
            System.out.println("Помилка");
            return;
        }

        Random rnd = new Random();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rnd.nextInt(101) - 50;
            }
        }

        System.out.println("Початкова матриця:");
        print(a);

        for (int i = 0; i < m; i++) {
            for (int p = 0; p < n - 1; p++) {
                for (int q = 0; q < n - 1 - p; q++) {
                    if (a[i][q] > a[i][q + 1]) {
                        int t = a[i][q];
                        a[i][q] = a[i][q + 1];
                        a[i][q + 1] = t;
                    }
                }
            }
        }

        System.out.println("Матриця після сортування:");
        print(a);
    }
}
