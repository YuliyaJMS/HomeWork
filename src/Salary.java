import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество рабочих дней за месяц: ");
        short day = scanner.nextShort();
        System.out.println("Введите сумму зарплаты за один день: ");
        double salaryOne = scanner.nextDouble();
        double sumSalary = day * salaryOne;
        System.out.println("Зарплата за отработанный период: " + sumSalary);
    }
}
