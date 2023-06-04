
public class FourteenthTask {

    public static void main(String[] args) {

        int[] array = new int[15];

        int min = -21;

        int max = 21;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min) + min);
        }

        getMaxAndMin(array);
    }

    public static void getMaxAndMin(int[] array) {
        int min = 99999;
        int max = -99999;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];

            }
        }  System.out.println("Максимальное значение - " + max);
        System.out.println("Минимальное значение - " + min);

        if (Math.abs(min) > Math.abs(max)) {
            System.out.println("Наибольшее число по модулю - " + Math.abs(min));
        } else {
            System.out.println("Наибольшее число по модулю - " + Math.abs(max));
        }
    }
}
