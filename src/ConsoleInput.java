import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.println("Введите значение b: ");
        int b = scanner.nextInt();
        System.out.println("Пользователь ввел значение для a: = " + a + " и b:= " + b);
        int store = a;
        a = b;
        b = store;
        System.out.println("Пользователь ввел значение для a: = " + a + " и b:= " + b);
    }
}
