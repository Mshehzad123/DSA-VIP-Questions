package ArrayQuestion;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,-3,6};
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = sumSubArray(arr);
        System.out.println("sum is : " + sum);//output should be 13
        int num = sumSubArray(nums);
        System.out.println("sum is : " +num );//out put should be 6
    }
    // using Kadane's Algorithm
    public static int sumSubArray(int nums[]){
        int currSum =0;
        int maxSum = nums[0];
        for (int i : nums){
            currSum +=i;
            if (currSum>maxSum){
                maxSum=currSum;
            }
            if (currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }



}
    
