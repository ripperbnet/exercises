import java.util.Scanner;

public class TenthTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int x = sc.nextInt();

        System.out.println("Введите количество столбцов: ");
        int y = sc.nextInt();

        int z = x * y;
        System.out.println("Необходимо добавить " + z + " чисел");


        int[][] twoDimArray = new int[x][y];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                int count = 0;
                if (count < z) {
                    System.out.println("Введите число для добавления в матрицу: ");
                    int number = sc.nextInt();
                    twoDimArray[i][j] = number;
                    count++;
                }
            }
        }
        for (int j = 0; j < twoDimArray[0].length; j++) {
            System.out.print(" " + twoDimArray[0][j]*3 + " ");
        }
        System.out.println();
    }
}
