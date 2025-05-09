import java.util.Scanner;
//Считать с консоли три вещественных числа, вывести их сумму и произведение.
public class ScanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Double one = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        Double two = scanner.nextDouble();
        System.out.println("Введите третье число: ");
        Double three = scanner.nextDouble();
        Double sum = one + two + three;
        Double proizvedenie = one * two * three;
        System.out.println("Сумма трех трех чисел: " + sum);
        System.out.println("Произведение: " + proizvedenie);
    }
}
