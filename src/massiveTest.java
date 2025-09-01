public class massiveTest {
    public static void main(String[] args) {
     /*  int [] array={1,3,7,4,2};
        for (int i =0; i <=4; i++) {
            System.out.println(array[i]);
        }
        */
//дан массив целых чисел,  найти сумму всех его элементов
        int[] arrayTask1 = {2, 1, 6, 4, 9, 8};
        int sum = 0;
        for (int i = 0; i < arrayTask1.length; i++) {
//            System.out.println(array1[i]);      //проверил что выводятся числа массива
            sum += arrayTask1[i];
        }
        System.out.println("Task1= " + "Сумма всех чисел = " + sum);

//дан массив целых чисел, найти наибольший элемент и его индекс
        int[] arrayTask2 = {13, 21, 5, 57, 96, 3};
        int high = 0;
        int index = 0;
        for (int i = 0; i < arrayTask2.length; i++) {
            if (arrayTask2[i] > high) {
                high = arrayTask2[i];
                index = i;
            }


        }
        System.out.println("Task2 Индекс числа = " + index);
        System.out.println("Task2 Максимальное число массива = " + high);

    }


}
