package be.intecbrussel.leetCode_exercises;

public class SumOddLengthSubarrays {
    /*
    Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
    A subarray is a contiguous subsequence of the array.
    Return the sum of all odd-length subarrays of arr.

    Input: arr = [1,4,2,5,3] Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
     */
    public static void main(String[] args) {
        int[] nums = {1,4,2,5,3};
        int result = sumOddLengthSubarrays(nums);
        System.out.println(result);
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            for (int j = i, l = 3; j < l; j++) {

                sum+=arr[j];

            }
        }

        return sum;
    }
}
