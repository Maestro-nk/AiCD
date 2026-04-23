package Lab_2_3;

import java.util.Scanner;

public class Main {

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long calculateArrangements(int n, int k) {
        long result = 1;
        for (int i = n - k + 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- ЛР 2.3: Комбінаторні алгоритми ---");
        System.out.println("Тип задачі: Розміщення без повторень (порядок має значення)");

        System.out.print("Введіть загальну кількість команд (n): ");
        int n = scanner.nextInt();

        System.out.print("Введіть кількість призових місць (k): ");
        int k = scanner.nextInt();

        if (k > n) {
            System.out.println("Помилка: кількість призових місць не може бути більшою за кількість команд.");
        } else if (k < 0 || n < 0) {
            System.out.println("Помилка: значення не можуть бути від'ємними.");
        } else {
            long result = calculateArrangements(n, k);
            System.out.println("\nКількість можливих варіантів переможців: " + result);
        }

        scanner.close();
    }
}