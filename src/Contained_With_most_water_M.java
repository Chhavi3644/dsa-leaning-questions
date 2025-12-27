public class Contained_With_most_water_M {
    public static void main(String[] args) {
        int[] ht={3, 0, 1, 0, 4, 0, 2 };
        System.out.print(trap(ht));
    }

    private static int trap(int[] arr) {
        int res = 0;


        for (int i = 1; i < arr.length - 1; i++) {

            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(left, arr[j]);

            int right = arr[i];
            for (int j = i + 1; j < arr.length; j++)
                right = Math.max(right, arr[j]);

            res += Math.min(left, right) - arr[i];
        }

        return res;
    }
}
