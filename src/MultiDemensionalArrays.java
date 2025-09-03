/**
 * Получить матрицу 6х6 заполненную по двум пересекающимся диагоналями единицами(1), все остальное - нули(0)
 */
public class MultiDemensionalArrays {
    public static void main(String[] args) {
        int n = 7;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) array[i][j] = 1;
                if (i + j == n - 1) array[i][j] = 1;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}

