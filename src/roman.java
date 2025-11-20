import java.util.HashMap;
import java.util.Map;

public class roman {
    public static void main(String[] args) {
        String s = "IV";  // Corrected String
        int res = romanToInt(s);
        System.out.println(res);  // Corrected System.out.print
    }

    private static int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (mp.get(s.charAt(i)) >= mp.get(s.charAt(i + 1))) {
                result += mp.get(s.charAt(i));
            } else {
                result -= mp.get(s.charAt(i));
            }
        }
        // Add last character value
        result += mp.get(s.charAt(s.length() - 1));

        return result;
    }
}
