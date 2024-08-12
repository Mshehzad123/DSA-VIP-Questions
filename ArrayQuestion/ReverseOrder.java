package ArrayQuestion;
public class ReverseOrder {
    public static void main(String[] args) {
        int arr[] = {1,6,2,8,4};
        ReverseArray(arr);
    }
    public static void ReverseArray(int arr[]){
        int reverse[] = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            reverse[i] = arr[arr.length -i-1];
        }
        System.out.println("reverse order array : ");
        for (int i : reverse){
            System.out.print(i + " ");

        }
    }
}
