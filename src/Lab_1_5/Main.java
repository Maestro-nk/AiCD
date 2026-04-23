package Lab_1_5;

public class Main {

    public static int linearSearchAndDelete(Student[] arr, int currentSize) {
        int newSize = currentSize;
        int i = 0;

        while (i < newSize) {
            Student s = arr[i];

            boolean isSummer = (s.birthMonth >= 6 && s.birthMonth <= 8);
            boolean isTourism = s.hobby.equalsIgnoreCase("туризм");

            if (isSummer && isTourism) {

                for (int j = i; j < newSize - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[newSize - 1] = null;
                newSize--;

            } else {
                i++;
            }
        }
        return newSize;
    }

    public static void printArray(Student[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Student[] students = new Student[20];

        students[0] = new Student("Коваленко", "Олег", 15, 7, 2005, "туризм"); // Видалити (літо + туризм)
        students[1] = new Student("Бойко", "Анна", 10, 5, 2004, "малювання");
        students[2] = new Student("Мельник", "Ігор", 22, 6, 2005, "туризм");   // Видалити (літо + туризм)
        students[3] = new Student("Шевчук", "Марія", 1, 12, 2004, "танці");
        students[4] = new Student("Ткаченко", "Максим", 14, 8, 2003, "спорт");
        students[5] = new Student("Бондар", "Олена", 5, 7, 2005, "читання");
        students[6] = new Student("Мороз", "Віктор", 30, 8, 2004, "туризм");   // Видалити (літо + туризм)
        students[7] = new Student("Кравченко", "Ілля", 12, 3, 2005, "програмування");
        students[8] = new Student("Олійник", "Дар'я", 19, 6, 2004, "музика");
        students[9] = new Student("Лисенко", "Тарас", 8, 1, 2003, "туризм");   // Залишити (не літо)
        students[10] = new Student("Григоренко", "Яна", 25, 7, 2005, "малювання");
        students[11] = new Student("Сидоренко", "Андрій", 11, 4, 2004, "спорт");
        students[12] = new Student("Петренко", "Оксана", 17, 8, 2005, "туризм"); // Видалити (літо + туризм)
        students[13] = new Student("Савченко", "Дмитро", 2, 9, 2003, "програмування");
        students[14] = new Student("Павленко", "Юлія", 28, 6, 2005, "танці");
        students[15] = new Student("Мазур", "Роман", 14, 2, 2004, "туризм");   // Залишити (не літо)
        students[16] = new Student("Поліщук", "Наталія", 9, 7, 2005, "туризм");  // Видалити (літо + туризм)
        students[17] = new Student("Яковенко", "Сергій", 23, 11, 2003, "спорт");
        students[18] = new Student("Гаврилюк", "Ірина", 16, 8, 2005, "читання");
        students[19] = new Student("Литвин", "Олександр", 4, 5, 2004, "музика");

        int currentSize = students.length;

        System.out.println("Вміст масиву ДО пошуку та видалення (" + currentSize + " студентів):");
        printArray(students, currentSize);

        currentSize = linearSearchAndDelete(students, currentSize);

        System.out.println("Вміст масиву ПІСЛЯ видалення (залишилося " + currentSize + " студентів):");
        printArray(students, currentSize);
    }
}