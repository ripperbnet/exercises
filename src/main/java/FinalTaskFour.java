import java.util.Scanner;

public class FinalTaskFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tryCount = 1;

        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Введите ответ: ");

        String answer = sc.nextLine();

        while (tryCount < 3) {
            if (!answer.equalsIgnoreCase("заархивированный вирус")) {
                tryCount++;
                System.out.println("Подумай еще!");
                answer = sc.nextLine();
                if (tryCount == 3 && !answer.equalsIgnoreCase("заархивированный вирус")) {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                } else if (answer.equalsIgnoreCase("заархивированный вирус")) {
                    System.out.println("Правильно!");
                    break;
                }
            } else if (answer.equalsIgnoreCase("заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            }
        }
    }
}


