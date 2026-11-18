import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        System.out.println("Практична робота №7");
        System.out.println("Виконав здобувач освіти: Кирило Коробейко");
        System.out.println("Варіант: 21");
        System.out.println("Завдання 3.4");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть N: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Помилка");
            return;
        }

        int[][][] cube = new int[n][n][n];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    cube[x][y][z] = 100 * x + 10 * y + z;
                }
            }
        }

        System.out.print("Введіть вісь: ");
        String axis = sc.next();
        if (!axis.equals("x") && !axis.equals("y") && !axis.equals("z")) {
            System.out.println("Помилка");
            return;
        }

        System.out.print("Введіть індекс: ");
        int k = sc.nextInt();
        if (k < 0 || k >= n) {
            System.out.println("Помилка");
            return;
        }

        int[][] slice = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (axis.equals("x")) {
                    slice[i][j] = cube[k][i][j];
                } else if (axis.equals("y")) {
                    slice[i][j] = cube[i][k][j];
                } else {
                    slice[i][j] = cube[i][j][k];
                }
            }
        }

        int sliceSum = 0;
        System.out.println("Переріз:");
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(String.format("%5d", slice[i][j]));
                sliceSum += slice[i][j];
            }
            System.out.println(sb);
        }

        int diagSum = 0;
        for (int i = 0; i < n; i++) {
            diagSum += cube[i][i][i];
        }

        System.out.println("Сума елементів перерізу: " + sliceSum);
        System.out.println("Сума елементів просторової діагоналі: " + diagSum);
    }
}
