package Lab_1_3;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        System.out.println("Додаємо студентів до дерева (ключ - студентський квиток)...");

        tree.insert(new Student("Шевченко", "Тарас", 3, 1005, true));

        tree.insert(new Student("Франко", "Іван", 2, 1002, false));
        tree.insert(new Student("Українка", "Леся", 4, 1008, false));
        tree.insert(new Student("Стус", "Василь", 1, 1001, true));
        tree.insert(new Student("Костенко", "Ліна", 5, 1004, false));
        tree.insert(new Student("Симоненко", "Василь", 3, 1006, true));
        tree.insert(new Student("Тичина", "Павло", 2, 1009, false));

        tree.insert(new Student("Котляревський", "Іван", 1, 1005, true));

        System.out.println("\nРезультат обходу дерева в ширину:");
        tree.printBreadthFirst();
    }
}