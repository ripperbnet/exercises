import java.util.Scanner;

public class FinalTaskOne {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите сколько рублей необходимо обменять: ");
        double rouble = s.nextDouble();

        System.out.println("Введите курс доллара: ");
        double dollar = s.nextDouble();

        System.out.println("Получаем рублей: " + currencyConverter(rouble, dollar));
    }

    public static String currencyConverter(double rouble, double dollar) {

        String result = String.format("%.2f", rouble/dollar);

        return result;
    }
}
