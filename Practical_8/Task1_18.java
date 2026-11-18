import java.util.Scanner;

public class Task1_18 {
    public static void main(String[] args) {
        System.out.println("Практична робота №8");
        System.out.println("Виконав здобувач освіти: Кирило Коробейко");
        System.out.println("Варіант: 21");
        System.out.println("Завдання 1.18");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть слово: ");
        String word = sc.nextLine();
        if (word.trim().length() == 0) {
            System.out.println("Помилка");
            return;
        }

        int n = word.length();
        for (int i = 1; i <= n; i++) {
            System.out.println(word.substring(0, i));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(word.substring(i));
        }
    }
}
