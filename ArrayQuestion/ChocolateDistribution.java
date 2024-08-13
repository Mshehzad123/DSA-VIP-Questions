package ArrayQuestion;
//question is :
// Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

import java.util.Arrays;

// Each student gets one packet.
// The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
public class ChocolateDistribution {

    public static void main(String[] args) {
       int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44};
       int m =7;
       System.out.println(findMinDiff(arr, m));       
    }
    //method to find this is `
    public static int findMinDiff(int[] packet, int m){
        int n = packet.length;
        //condition
        if (n==0||m==0||n<m){
            return -1;
        }
        Arrays.sort(packet);
        int minDiff = Integer.MAX_VALUE;
        for (int i=0;i+m-1<n;i++){
            int diff = packet[i+m-1] -packet[i];
            if (diff<minDiff){
                minDiff=diff;
            }
        }
        return minDiff;
    }
}