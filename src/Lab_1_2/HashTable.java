package Lab_1_2;

public class HashTable {
    private Rectangle[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        this.table = new Rectangle[size];
    }

    private int hashFunction(double key) {
        return (int) (key) % size;
    }

    public boolean insert(Rectangle rect) {
        double perimeter = rect.getPerimeter();
        int index = Math.abs(hashFunction(perimeter));
        if (table[index] != null) {
            return false;
        }

        table[index] = rect;
        return true;
    }

    public void display() {
        System.out.println("\n--- Вміст хеш-таблиці ---");
        for (int i = 0; i < size; i++) {
            if (table[i] == null) {
                System.out.printf("Позиція %d: [Порожньо]\n", i);
            } else {
                System.out.printf("Позиція %d: Ключ (Периметр) = %.2f, Елемент = %s\n",
                        i, table[i].getPerimeter(), table[i].toString());
            }
        }
    }
}