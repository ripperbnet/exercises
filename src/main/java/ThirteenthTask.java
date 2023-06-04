
public class ThirteenthTask {

    public static void main(String[] args) {
        textChanges("I love java 8 Я люблю java 14 core1");
    }

    public static void textChanges(String txt) {
        String result = "";
        int count = 1;
        txt = txt.replaceAll("[\\dа-яёА-ЯЁ]", "");
        result = txt.replaceAll("\\s+", " ");
        System.out.println(result);
        for (int i = 0; i < result.length()-1; i++) {
            if (result.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Количество слов = " + count);
    }
}
