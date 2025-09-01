import java.util.Scanner;

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
        int highTask2 = 0;
        int indexTask2 = 0;
        for (int i = 0; i < arrayTask2.length; i++) {
            if (arrayTask2[i] > highTask2) {
                highTask2 = arrayTask2[i];
                indexTask2 = i;
            }


        }
        System.out.println("Task2 Индекс числа = " + indexTask2);
        System.out.println("Task2 Максимальное число массива = " + highTask2);

        //дан массив целых чисел, найти наименьший элемент и его индекс

        int[] arrayTask3 = {65, 32, 99, 105, 11, 3};
        int minTask3 = arrayTask3[0];
        int indexTask3 = 0;
        for (int i = 0; i < arrayTask3.length; i++) {
            if (arrayTask3[i] < minTask3) {
                minTask3 = arrayTask3[i];
                indexTask3 = i;
            }

        }
        System.out.println("Task3 Индекс числа = " + indexTask3);
        System.out.println("Task3 Минимальное число массива = " + minTask3);

        //Вводим число и проверяем есть оно в массиве или нет
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число!");
        int[] arrayTask7 = {13, 25, 12, 65, 32, 75, 13, 786};
        int number = sc.nextInt();
        int indexTask7 = 0;
        boolean founded = false;
        for (int i = 0; i < arrayTask7.length; i++) {

            if (arrayTask7[i] == number) {
                founded = true;
                System.out.println(number);
                return;
            }

        }
        if (!founded) {
            System.out.println("Такого числа нет");
        }

    }
}


