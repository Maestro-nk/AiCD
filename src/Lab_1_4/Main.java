package Lab_1_4;

public class Main {

    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].group > key.group) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Student[] students = {
                new Student("Коваленко", "Олег", 302, "ФІТ"),
                new Student("Бойко", "Анна", 101, "ФКН"),
                new Student("Мельник", "Ігор", 205, "ФІТ"),
                new Student("Шевчук", "Марія", 101, "Кібербезпека"),
                new Student("Ткаченко", "Максим", 404, "ФКН")
        };

        System.out.println("Вміст масиву ДО сортування:");
        printArray(students);

        insertionSort(students);

        System.out.println("Вміст масиву ПІСЛЯ сортування (за зростанням номера групи):");
        printArray(students);
    }
}