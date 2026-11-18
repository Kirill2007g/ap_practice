import java.util.Scanner;

public class Task2_9 {
    public static void main(String[] args) {
        System.out.println("Практична робота №8");
        System.out.println("Виконав здобувач освіти: Кирило Коробейко");
        System.out.println("Варіант: 21");
        System.out.println("Завдання 2.9");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        String s = sc.nextLine();

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }

        String missing = "";
        boolean isogram = true;
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                if (missing.length() > 0) missing += ", ";
                missing += (char) ('a' + i);
            }
            if (count[i] > 1) isogram = false;
        }

        if (missing.length() == 0) {
            System.out.println("Панграма: так");
        } else {
            System.out.println("Панграма: ні");
            System.out.println("Відсутні літери: " + missing);
        }
        System.out.println("Ізограма: " + (isogram ? "так" : "ні"));
    }
}
