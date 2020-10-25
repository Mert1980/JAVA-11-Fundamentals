package CodingBat_Exercises;

public class IsEverywhere {
    /*
    We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
    at least one of the pair is that value. Return true if the given value is everywhere in the array.

    isEverywhere([1, 2, 1, 3], 1) → true
    isEverywhere([1, 2, 1, 3], 2) → false
    isEverywhere([1, 2, 1, 3, 4], 1) → false
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3};
        boolean result = isEverywhere(nums, 1);
        System.out.println(result);
    }

    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] == val || nums[i] == val ){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
