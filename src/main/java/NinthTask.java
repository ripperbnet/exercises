public class NinthTask {

    public static void main(String[] args) {

        setSizeAndArray(3, new double[]{47, 143, 10});
    }

    public static void setSizeAndArray(int size, double[] constant) {

        double[] array = new double[size];

        double x = 0;

        for (int i = 0; i < constant.length; i++) {
            array[i] = constant[i];
            x += array[i];
        }
        System.out.println(x/array.length);
    }
}
