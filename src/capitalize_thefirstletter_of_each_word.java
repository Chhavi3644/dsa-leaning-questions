import java.util.Locale;

public class capitalize_thefirstletter_of_each_word {
    public static void main(String[] args) {
        String title = "capitalize tHe title";
        String res = caps(title);
        System.out.print(res);
    }

    private static String caps(String title) {
        title = title.toLowerCase(Locale.ROOT);
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 3) {
                sb.append(words[i]).append(" ");
            } else {
                char ch = Character.toUpperCase(words[i].charAt(0));
                String new_word = ch + words[i].substring(1);
                sb.append(new_word).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
 