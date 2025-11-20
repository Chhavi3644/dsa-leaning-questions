public class longestcommonprefix {
    public static void main(String[] args) {
        String[] arr={"flower","flow","flight"};
        String res=loncompref(arr);
        System.out.println(res);

    }

    private static String loncompref(String[] arr) {
        if(arr.length==0 || arr==null){
            return "";
        }
        for(int i=0;i<arr[0].length();i++) {
            char ch = arr[0].charAt(i);
            for(int j=1;j<arr.length;j++){
                if(i==arr[j].length() || arr[j].charAt(i)!=ch){
                    return arr[0].substring(0,i);
                }

            }
        }
    return arr[0];
    }
}
