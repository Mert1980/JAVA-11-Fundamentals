package be.intecbrussel.codingBat_exercises;

public class CenteredAverage {

    /*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
You may assume that the array is length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
    */

    public static void main(String[] args) {
      int[] testArr1 = {1, 2, 3, 4, 100};
      int[] testArr2 = {1, 1, 5, 5, 10, 8, 7};
      int[] testArr3 = {100, 0, 5, 3, 4};
      int centeredAverage = centeredAverage(testArr3);
      System.out.println(centeredAverage);
    }

    public static int centeredAverage(int[] nums){
        int min = findMin(nums);
        int max = findMax(nums);
        int sum = 0;
        for (int num:nums
             ) {
           sum+=num;
        }
        int centeredAverage = (sum - (min + max)) / (nums.length - 2);
        return centeredAverage;
    }
    public static int findMin(int[] nums){
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(Math.min(nums[i], nums[i-1]) < min){
                min = Math.min(nums[i], nums[i-1]);
            }
        }
        return min;
    }

    public static int findMax(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(Math.max(nums[i], nums[i-1]) > max){
                max = Math.max(nums[i], nums[i-1]);
            }
        }
        return max;
    }
}
