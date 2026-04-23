package Lab_2_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String regex = "^[+-][5-9]+([0-4]*|[A-G]*)-$";

        String filePath = "src/lab_2_2/words.txt";

        System.out.println("--- ЛР 2.2: Пошук текстових образів ---");
        System.out.println("Регулярний вираз: " + regex);
        System.out.println("\nРезультати перевірки файлу:");
        System.out.println("---------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String word;
            while ((word = br.readLine()) != null) {
                word = word.trim();

                if (!word.isEmpty()) {
                    if (word.matches(regex)) {
                        System.out.println("[ПІДХОДИТЬ]   " + word);
                    } else {
                        System.out.println("[ВІДХИЛЕНО]   " + word);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
            System.out.println("Переконайтеся, що файл words.txt лежить саме у папці src/lab_2_2/");
        }
    }
}