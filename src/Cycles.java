import java.util.Arrays;

/**
 * Создать массив, инициализировать его только четными числами,  потом каждый второй элемент массива умножить на предыдущий. Использовать каждый вид циклов.
 */
public class Cycles {
    public static void main(String[] args) {
        int n = 10;
        int[] array = createArray(n);
        showInfo(array);
        int[] forMethodResult = forMethod(array);
        showInfo(forMethodResult);
        int[] whileMethodResult=whileMethod(array);
        showInfo(whileMethodResult);
        int[] doWhileMethodResult=doWhileMethod(array);
        showInfo(doWhileMethodResult);
    }

    public static void showInfo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }
        return array;
    }

    public static int[] forMethod(int[] originalArray) {
        int[] array = Arrays.copyOf(originalArray, originalArray.length);

        for (int i = 1; i < array.length; i += 2) {
            array[i] = array[i] * array[i - 1];
        }
        return array;
    }

    public static int[] doWhileMethod(int[] originalArray) {
        int[] array = Arrays.copyOf(originalArray, originalArray.length);
        int j = 1;
        do {
            array[j] = array[j] * array[j - 1];
            j += 2;
        }
        while (j < array.length);
        return array;
    }

    public static int[] whileMethod(int[] originalArray) {
        int[] array = Arrays.copyOf(originalArray, originalArray.length);
        int j = 1;
        while (j < array.length) {
            array[j] = array[j] * (array[j - 1]);
            j += 2;
        }
        return array;
    }
}