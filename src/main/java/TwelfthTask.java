public class TwelfthTask {

    public static void main(String[] args) {
        textChanges("I like Java!!!");

    }

    public static void textChanges(String txt) {
        if (txt.contains("Java")) {
            if (txt.startsWith("I like")) {
                if (txt.endsWith("!!!")) {
                    System.out.println(txt.toUpperCase().replaceAll("A", "O").substring(7, 11));
                }
            }
        }
    }
}
