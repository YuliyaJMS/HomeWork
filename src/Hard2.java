import java.util.Scanner;

public class Hard2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты вершины А (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Введите координаты вершины B (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Введите координаты вершины C (x3, y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника: " + area);
    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
