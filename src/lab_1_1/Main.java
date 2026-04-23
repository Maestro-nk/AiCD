package lab_1_1;

public class Main {
    public static void main(String[] args) {
        VectorList list = new VectorList(5);

        System.out.println("--- Вставлення елементів ---");
        list.insert("15");
        list.insert("42");
        list.insert("100");
        list.insert("-5");   // Буде проігноровано (не додатнє)
        list.insert("abc");  // Буде проігноровано (не число)
        list.insert("2026");

        list.print();

        System.out.println("\n--- Видалення елементів ---");
        String removed1 = list.remove(1);
        System.out.println("Видалено елемент: " + removed1);
        list.print();

        String removed2 = list.remove(0);
        System.out.println("Видалено елемент: " + removed2);

        list.print();
    }
}