import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        Double a = scanner.nextDouble();
        System.out.println("Введите значение b: ");
        Double b = scanner.nextDouble();
        System.out.println("Введите значение c: ");
        Double c = scanner.nextDouble();
        Double discriminant = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Дискриминант = " + discriminant);

    }
}
