package ArrayQuestion;

import java.util.HashSet;

public class DuplicateContains {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1};
        System.out.println(isDuplicate(arr));
    }
    public static boolean isDuplicate(int arr[]){
        HashSet<Integer> seen = new HashSet<>();
        for (int i : arr){
            if (seen.contains(i)){
                return true;
            }
            seen.add(i);
        }
        return false;
    }
}
