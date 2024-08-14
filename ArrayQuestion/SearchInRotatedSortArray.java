package ArrayQuestion;

public class SearchInRotatedSortArray {
    public static void main(String[] args) {
        int target=4;
        int arr[]= {1,2,3,4,5};
System.out.println(Search(arr, target));        
    }
    public static int Search(int arr[] , int target){
        int left=0, right =arr.length-1;
        while (left<=right) {
            int mid = left + (right-left)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (arr[left]<=arr[mid]){
                if (arr[left]<=target && target<=arr[mid]){
                    right=mid -1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if (arr[mid]<=target && target<=arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            

        }
        return -1;
    }
}
