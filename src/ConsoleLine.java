import java.util.Scanner;

public class ConsoleLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scanner.nextLine();
        System.out.println("Размер строки: " + line.length());
    }
}
