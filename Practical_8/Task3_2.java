import java.util.Scanner;

public class Task3_2 {
    static boolean isLatin(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {
        System.out.println("Практична робота №8");
        System.out.println("Виконав здобувач освіти: Кирило Коробейко");
        System.out.println("Варіант: 21");
        System.out.println("Завдання 3.2");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть email: ");
        String s = sc.nextLine();

        int at = -1;
        int atCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@') {
                atCount++;
                if (at == -1) at = i;
            }
        }
        if (atCount != 1) {
            System.out.println("має бути рівно один символ @");
            return;
        }

        String local = s.substring(0, at);
        String domain = s.substring(at + 1);

        if (local.length() == 0) {
            System.out.println("локальна частина порожня");
            return;
        }
        for (int i = 0; i < local.length(); i++) {
            char c = local.charAt(i);
            if (!isLatin(c) && !isDigit(c) && c != '.' && c != '_' && c != '-') {
                System.out.println("недопустимий символ у локальній частині");
                return;
            }
        }
        if (local.charAt(0) == '.' || local.charAt(local.length() - 1) == '.') {
            System.out.println("локальна частина починається або закінчується крапкою");
            return;
        }

        if (domain.indexOf('.') < 0) {
            System.out.println("домен не містить крапки");
            return;
        }
        for (int i = 0; i < domain.length(); i++) {
            char c = domain.charAt(i);
            if (!isLatin(c) && !isDigit(c) && c != '-' && c != '.') {
                System.out.println("недопустимий символ у домені");
                return;
            }
        }
        for (int i = 1; i < domain.length(); i++) {
            if (domain.charAt(i) == '.' && domain.charAt(i - 1) == '.') {
                System.out.println("дві крапки поспіль у домені");
                return;
            }
        }
        if (domain.charAt(0) == '.' || domain.charAt(domain.length() - 1) == '.') {
            System.out.println("домен починається або закінчується крапкою");
            return;
        }

        String zone = domain.substring(domain.lastIndexOf('.') + 1);
        boolean zoneOk = zone.length() >= 2;
        for (int i = 0; i < zone.length(); i++) {
            if (!isLatin(zone.charAt(i))) zoneOk = false;
        }
        if (!zoneOk) {
            System.out.println("некоректна доменна зона");
            return;
        }

        System.out.println("Логін: " + local);
        System.out.println("Домен: " + domain);
    }
}
