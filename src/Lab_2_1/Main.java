package Lab_2_1;

import java.util.Scanner;

public class Main {

    public static double f(double x) {
        return Math.exp(x);
    }

    public static double rectangleMethod(double a, double b, double h) {
        double sum = 0;
        int n = (int) Math.round((b - a) / h);

        for (int i = 0; i < n; i++) {
            double x = a + i * h + h / 2.0;
            sum += f(x);
        }
        return h * sum;
    }

    public static double trapezoidMethod(double a, double b, double h) {
        int n = (int) Math.round((b - a) / h);
        double sum = (f(a) + f(b)) / 2.0;

        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            sum += f(x);
        }
        return h * sum;
    }

    public static double simpsonMethod(double a, double b, double h) {
        int n = (int) Math.round((b - a) / h);

        if (n % 2 != 0) {
            System.out.println("  [!] Увага: для методу Сімпсона кількість відрізків має бути парною.");
            System.out.println("  [!] При заданому кроці точність цього методу може впасти.");
        }

        double sum = f(a) + f(b);
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 2 == 0) {
                sum += 2 * f(x);
            } else {
                sum += 4 * f(x);
            }
        }
        return (h / 3.0) * sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- ЛР 2.1: Чисельне інтегрування функції f(x) = e^x ---");

        System.out.print("Введіть початок інтервалу (a): ");
        double a = scanner.nextDouble();

        System.out.print("Введіть кінець інтервалу (b): ");
        double b = scanner.nextDouble();

        System.out.print("Введіть крок (h): ");
        double h = scanner.nextDouble();

        System.out.println("\nРезультати обчислень:");
        System.out.printf("Метод прямокутників: %.5f\n", rectangleMethod(a, b, h));
        System.out.printf("Метод трапецій:      %.5f\n", trapezoidMethod(a, b, h));
        System.out.printf("Метод Сімпсона:      %.5f\n", simpsonMethod(a, b, h));

        double exact = Math.exp(b) - Math.exp(a);
        System.out.printf("\nТочне аналітичне значення: %.5f\n", exact);

        scanner.close();
    }
}