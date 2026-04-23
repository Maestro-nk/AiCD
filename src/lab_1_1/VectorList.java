package lab_1_1;

public class VectorList {
    private String[] array;
    private int size;

    public VectorList(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    public boolean isFull() {
        return size == array.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isValid(String element) {
        if (element == null || element.trim().isEmpty()) return false;
        return element.matches("^[1-9]\\d*$");
    }

    public boolean insert(String element) {
        if (isFull()) {
            System.out.println("Помилка: Структура даних заповнена.");
            return false;
        }
        if (!isValid(element)) {
            System.out.println("Помилка: Елемент '" + element + "' не є додатнім цілим числом.");
            return false;
        }

        array[size] = element;
        size++;
        return true;
    }

    public String remove(int index) {
        if (isEmpty()) {
            throw new IllegalStateException("Помилка: Структура даних порожня.");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Помилка: Невірний індекс.");
        }

        String removedElement = array[index];

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;

        return removedElement;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Список порожній.");
            return;
        }
        System.out.print("Вміст списку: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
