import java.util.Scanner;

public class FinalTaskTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите уравнение:");
        String s = sc.next();

        int result = 0;

        if (s.charAt(0) == 'x') {
            if (s.charAt(1) == '+') {
                result = Integer.parseInt(s.substring(4, 5)) - Integer.parseInt(s.substring(2, 3));
            } else if (s.charAt(1) == '-') {
                result = Integer.parseInt(s.substring(4, 5)) + Integer.parseInt(s.substring(2, 3));
            }
        } else if (s.charAt(2) == 'x') {
            if (s.charAt(1) == '+') {
                result = s.charAt(4) - s.charAt(0);
            } else if (s.charAt(1) == '-') {
                if (Integer.parseInt(s.substring(0, 1)) < Integer.parseInt(s.substring(4, 5))) {
                    result = Integer.parseInt(s.substring(4, 5)) - Integer.parseInt(s.substring(0, 1));
                } else if (Integer.parseInt(s.substring(0, 1)) > Integer.parseInt(s.substring(4, 5))) {
                    result = Integer.parseInt(s.substring(0, 1)) - Integer.parseInt(s.substring(4, 5));
                }
            }
        } else if (s.charAt(4) == 'x') {
            if (s.charAt(1) == '+') {
                result = Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(2, 3));
            } else if (s.charAt(1) == '-') {
                result =  Integer.parseInt(s.substring(0, 1)) - Integer.parseInt(s.substring(2, 3));
            }
        }
        System.out.println(result);
    }
}
