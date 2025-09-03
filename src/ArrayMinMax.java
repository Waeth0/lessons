/**
 *Создать массив, заполнить его рандомными числами, найти максимальное и минимальное значение
 */
public class ArrayMinMax {

    public static void main(String[] args) {
        int range = 10;
        double[] array = createArray(range);
        showInfo(array);
        double forMethodMaxResult = forMethodMax(array);
        System.out.println("Максимальное значение= " + forMethodMaxResult);
        double forMethodMinResult = forMethodMin(array);
        System.out.println("Минимальное значение= " + forMethodMinResult);
    }
    public static void showInfo(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static double[] createArray(int range) {
        double[] array = new double[range];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * (200 + 1) - 100);
        }
        return array;
    }
    public static double forMethodMax(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    public static double forMethodMin(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}

