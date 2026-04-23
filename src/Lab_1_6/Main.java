package Lab_1_6;

public class Main {

    public static void mergeSort(double[] array) {
        if (array.length < 2) return;
        double[] temp = new double[array.length];
        sort(array, temp, 0, array.length - 1);
    }

    private static void sort(double[] array, double[] temp, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        sort(array, temp, left, mid);
        sort(array, temp, mid + 1, right);
        merge(array, temp, left, mid, right);
    }


    private static void merge(double[] array, double[] temp, int left, int mid, int right) {

        for (int i = left; i <= right; i++) {
            temp[i] = array[i];
        }

        int i = left;
        int j = mid + 1;

        for (int k = left; k <= right; k++) {
            if (i > mid) array[k] = temp[j++];
            else if (j > right) array[k] = temp[i++];
            else if (temp[j] < temp[i]) array[k] = temp[j++];
            else array[k] = temp[i++];
        }
    }
    // --------------------------------------------------------------------

    public static void main(String[] args) {
        int N = 100;
        int[] sizes = {N, N * N, N * N * N};

        System.out.println("Дослідження часу виконання: Сортування низхідним злиттям");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-15s | %-20s\n", "Кількість (N)", "Час (наносекунди)");
        System.out.println("-------------------------------------------------------");

        for (int size : sizes) {
            double[] array = new double[size];
            for (int i = 0; i < size; i++) {
                array[i] = Math.random();
            }

            long startTime = System.nanoTime();
            mergeSort(array);
            long endTime = System.nanoTime();

            long duration = endTime - startTime;

            System.out.printf("%-15d | %-20d\n", size, duration);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Готово! Ці цифри потрібні для побудови графіка у звіті.");
    }
}