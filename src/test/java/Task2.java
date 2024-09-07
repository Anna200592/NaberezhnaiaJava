import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = getStr(sc, "Введите первую строку (a): ");
        String b = getStr(sc, "Введите вторую строку (b): ");

        if (a.equalsIgnoreCase(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        sc.close();
    }

    private static String getStr(Scanner sc, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Ошибка! Строка не может быть пустой. Попробуйте снова.");
            } else {
                return input;
            }
        }
    }
}
