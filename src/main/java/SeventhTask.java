
public class SeventhTask {

    public static void main(String[] args) {
        setSizeAndArray(3, new int[]{1, 5, 9});

    }

    public static void setSizeAndArray(int size, int[] constant) {

        int[] array = new int[size];

        final int X = 5;

        final int Y = 8;

        final int Z = 10;

        for (int i = 0; i < constant.length; i++) {
            array[i] = constant[i];
            if (constant[i] == X || constant[i] == Y || constant[i] == Z) {
                System.out.println("Данное значение имеется в константах: " + constant[i]);
            }
        }
    }
}
