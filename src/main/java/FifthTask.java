import java.util.Scanner;

public class FifthTask {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x = s.nextInt();

        System.out.println("Введите второе число: ");
        int y = s.nextInt();

        System.out.println("Введите операцию: ");
        String z = s.next();

        System.out.println(calculator(x, y, z));
    }

    public static int calculator(int x, int y, String z) {
        int result = 0;
        switch (z) {
            case "+" :
                result = x+y;
                break;
            case "-" :
                result = x-y;
                break;
            case "*" :
                result = x*y;
            break;
            case "/" :
                result = x/y;
                break;
        }
        return result;
    }
}
