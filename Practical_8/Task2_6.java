import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        System.out.println("Практична робота №8");
        System.out.println("Виконав здобувач освіти: Кирило Коробейко");
        System.out.println("Варіант: 21");
        System.out.println("Завдання 2.6");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть пароль: ");
        String p = sc.nextLine();

        String special = "!@#$%^&*";
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean spec = false;
        boolean space = false;
        boolean triple = false;

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c >= 'A' && c <= 'Z') upper = true;
            if (c >= 'a' && c <= 'z') lower = true;
            if (c >= '0' && c <= '9') digit = true;
            if (special.indexOf(c) >= 0) spec = true;
            if (c == ' ') space = true;
            if (i >= 2 && c == p.charAt(i - 1) && c == p.charAt(i - 2)) triple = true;
        }

        int violated = 0;
        if (p.length() < 8) {
            System.out.println("довжина менше 8 символів");
            violated++;
        }
        if (!upper) {
            System.out.println("немає великої латинської літери");
            violated++;
        }
        if (!lower) {
            System.out.println("немає малої латинської літери");
            violated++;
        }
        if (!digit) {
            System.out.println("немає цифри");
            violated++;
        }
        if (!spec) {
            System.out.println("немає спеціального символу");
            violated++;
        }
        if (space) {
            System.out.println("містить пробіли");
            violated++;
        }
        if (triple) {
            System.out.println("три однакові символи поспіль");
            violated++;
        }

        if (violated == 0) {
            System.out.println("Пароль надійний");
            System.out.println("Рівень надійності: надійний");
        } else if (violated <= 2) {
            System.out.println("Рівень надійності: середній");
        } else {
            System.out.println("Рівень надійності: слабкий");
        }
    }
}
