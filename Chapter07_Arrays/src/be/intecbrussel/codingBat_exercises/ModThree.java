package be.intecbrussel.codingBat_exercises;

public class ModThree {
    /*
    Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

    modThree([2, 1, 3, 5]) → true
    modThree([2, 1, 2, 5]) → false
    modThree([2, 4, 2, 5]) → true
     */
    public static void main(String[] args) {
        int[] test1 = {9, 7, 2, 9};
        boolean hasTwo = modThree(test1);
        System.out.println(hasTwo);
    }
    public static boolean modThree(int[] nums) {
        for (int i = 2; i < nums.length; i++) {
            if(nums[i-2] %2 == 0 && nums[i-1] %2 == 0 && nums[i] %2 == 0 ) {
                return true;
            }
            if(nums[i-2] %2 != 0 && nums[i-1] %2 != 0 && nums[i] %2 != 0 ) {
                return true;
            }
        }
        return false;
   }
}
