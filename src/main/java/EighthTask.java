public class EighthTask {

    public static void main(String[] args) {
        sumOfNumbers(10);

    }

    public static void sumOfNumbers(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
