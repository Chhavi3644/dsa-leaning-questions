import java.lang.reflect.Array;
import java.util.Arrays;

public class mergesortedarrya {
  public static void main(String[] args) {

    int[] arr1={1,2,3,0,0,0};
    int m =3;
    int[] arr2={4,5,6};
    int n=3;
    int[] res=sortedArr(arr1,m,n,arr2);
    System.out.println(Arrays.toString(arr1));
  }

  private static int[] sortedArr(int[] arr1, int m, int n, int[] arr2) {
  int p1=m-1;
  int p2=n-1;
  int p3=arr1.length -1;
  while(p2 >= 0){
    int ele1,ele2;
    ele1=(p1>=0) ? arr1[p1] : Integer.MIN_VALUE;
    ele2=(p2>=0) ? arr2[p2] : Integer.MIN_VALUE;

    if(ele1>ele2){
      arr1[p3]=ele1;
      p3--;
      p1--;
    }else{
      arr1[p3]=ele2;
      p3--;
      p2--;
    }
  }
 return arr1;
  }
}
