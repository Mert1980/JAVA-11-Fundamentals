package CodingBat_Exercises;

public class BigDiff {
    /*
    Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
    Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

    bigDiff([10, 3, 5, 6]) → 7
    bigDiff([7, 2, 10, 9]) → 8
    bigDiff([2, 10, 7, 2]) → 8*/

    public static void main(String[] args) {
        int[] nums = {10, 3, 5, 6};
        int max = findMax(nums);
        int min = findMin(nums);
        System.out.println(max - min);;
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
