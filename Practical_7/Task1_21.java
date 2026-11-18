import java.util.Scanner;

public class Task1_21 {
    public static void main(String[] args) {
        System.out.println("Практична робота №7");
        System.out.println("Виконав здобувач освіти: Кирило Коробейко");
        System.out.println("Варіант: 21");
        System.out.println("Завдання 1.21");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть N: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Помилка");
            return;
        }

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.abs(i - j);
            }
        }

        System.out.println("Матриця:");
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(String.format("%4d", a[i][j]));
            }
            System.out.println(sb);
        }
    }
}
