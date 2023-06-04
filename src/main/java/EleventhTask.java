import java.util.Scanner;

public class EleventhTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        String x = sc.next();

        int xToInt = Integer.parseInt(x);

        System.out.println("Введите второе число: ");
        int y = sc.nextInt();

        if (xToInt > y) {
            System.out.println(xToInt + " - наибольшее число");
            double newY = y;
            System.out.println(newY + " - наименьшее число");
        }
        else {
            System.out.println(y + " - наибольшее число");
            double newX = xToInt;
            System.out.println(newX + " - наименьшее число");
        }
    }
}
