import java.util.Scanner;

public class SixthTask {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = s.nextInt();
        int y;

        if (x == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - миллиграмм");
            x = s.nextInt();
            if (x==1) {
                System.out.println("Введите число: ");
                y = s.nextInt();
                System.out.println("Килограммы: " + y);
                System.out.println("Граммы: " + y * 1000);
                System.out.println("Миллиграммы: " + y * 1000000);
            } else if (x==2) {
                System.out.println("Введите число: ");
                y = s.nextInt();
                System.out.println("Граммы: " + y);
                System.out.println("Килограммы: " + y / 1000);
                System.out.println("Миллиграммы: " + y * 1000);
            } else if (x==3) {
                System.out.println("Введите число: ");
                y = s.nextInt();
                System.out.println("Миллиграммы: " + y);
                System.out.println("Граммы: " + y / 1000);
                System.out.println("Килограммы: " + y / 1000000);
            } else System.out.println("Указано неверное значение");
        } else if (x == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            x = s.nextInt();
            if (x==1) {
                System.out.println("Введите число: ");
                y = s.nextInt();
                System.out.println("Метры: " + y);
                System.out.println("Мили: " + y * 0.000621371);
                System.out.println("Ярды: " + y * 1.09361);
                System.out.println("Футы: " + y * 3.28084);
            } else if (x==2) {
                System.out.println("Введите число: ");
                y = s.nextInt();
                System.out.println("Мили: " + y);
                System.out.println("Метры: " + y * 1609.34);
                System.out.println("Ярды: " + y * 1760);
                System.out.println("Футы: " + y * 5280);
            } else if (x==3) {
                System.out.println("Введите число: ");
                y = s.nextInt();
                System.out.println("Ярды: " + y);
                System.out.println("Метры: " + y * 0.9144);
                System.out.println("Мили: " + y * 0.000568182);
                System.out.println("Футы: " + y * 3);
            } else if (x==4) {
                System.out.println("Введите число: ");
                y = s.nextInt();
                System.out.println("Футы: " + y);
                System.out.println("Метры: " + y * 0.3048);
                System.out.println("Мили: " + y * 0.000189394);
                System.out.println("Ярды: " + y * 0.333333);
            } else System.out.println("Указано неверное значение");
        } else System.out.println("Указано неверное значение");
    }
}
