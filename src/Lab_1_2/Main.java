package Lab_1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір хеш-таблиці: ");
        int size = scanner.nextInt();

        HashTable hashTable = new HashTable(size);

        System.out.println("Генерація та вставлення елементів...");

        int itemsToInsert = size / 2;
        int inserted = 0;
        int attempts = 0;

        while (inserted < itemsToInsert && attempts < 100) {
            double x1 = Math.random() * 10;
            double y1 = Math.random() * 10;
            double x2 = x1 + Math.random() * 5 + 1;
            double y2 = y1 - Math.random() * 5 - 1;

            Rectangle rect = new Rectangle(x1, y1, x2, y2);

            if (hashTable.insert(rect)) {
                inserted++;
            }
            attempts++;
        }

        hashTable.display();
        scanner.close();
    }
}