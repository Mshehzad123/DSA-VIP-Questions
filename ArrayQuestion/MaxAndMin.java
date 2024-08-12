package ArrayQuestion;
public class MaxAndMin {

     public static void main(String[] args) {
        int arr[] = {2,45,67,3,90,1,0};
        int n = arr.length;
        System.out.println("minimum nmbr is : " + setMini(arr, n));
        System.out.println("maximum nmbr is : " + setMax(arr, n));
     }
     public static int setMini(int arr[], int n){
        int mini = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]<mini){
                mini=arr[i];
            }
        }
        return mini;
     }
     public static int setMax(int arr[] , int n){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
     }
}
