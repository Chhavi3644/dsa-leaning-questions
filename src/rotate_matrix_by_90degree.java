public class rotate_matrix_by_90degree {
    public static void main(String[] args) {
        int [][] mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] res=calculateRotatedMat(mat);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] calculateRotatedMat(int[][] mat) {
        transposeMatrix(mat);
        reverseRows(mat);
        return mat;
    }

    private static void transposeMatrix(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat.length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }

    private static void reverseRows(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            int left=0;
            int right=mat.length-1;
            while(left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }
        }

    }
}
