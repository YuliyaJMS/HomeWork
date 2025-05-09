import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество рабочих дней за месяц: ");
        Double day = scanner.nextDouble();
        System.out.println("Введите сумму зарплаты за один день: ");
        Double salaryOne = scanner.nextDouble();
        Double sumSalary = day * salaryOne;
        System.out.println("Зарплата за отработанный период: " + sumSalary);
    }
}
