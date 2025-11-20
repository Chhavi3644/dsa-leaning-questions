public class legthofLAstword {
    public static void main(String[] args) {
        String s="hello world";
        int res=lenword(s);
        System.out.println(res);
    }

    private static int lenword(String s) {
        String words[]=s.split(" ");
        String lstwd=words[words.length-1];
        int l=lstwd.length();
        return l;
    }
}
