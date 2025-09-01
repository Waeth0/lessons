public class massiveTest {
    public static void main(String[] args) {
     /*  int [] array={1,3,7,4,2};
        for (int i =0; i <=4; i++) {
            System.out.println(array[i]);
        }
        */
//дан массив целых чисел,  найти сумму всех его элементов
        int[] array1={2,1,6,4,9,8};
        int sum=0;
        for (int i = 0; i <array1.length ; i++) {
//            System.out.println(array1[i]);
            sum +=array1[i];
            }
        System.out.println("Сумма всех чисел = "+ sum);
        }
    }
