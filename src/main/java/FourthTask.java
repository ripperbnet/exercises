import java.util.Scanner;

public class FourthTask {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x = s.nextInt();

        System.out.println("Введите второе число: ");
        int y = s.nextInt();

        System.out.println("Введите третье число: ");
        int z = s.nextInt();

        System.out.println("Среднее арифметическое число - " + averageNumb(x, y, z));

        int result = (int)Math.floor(averageNumb(x, y, z)/2);

        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }


    }

    public static int averageNumb(int number1, int number2, int number3) {

        return (number1+number2+number3)/3;
    }
}
