package be.intecbrussel.codingBat_exercises;

public class Either24 {
    /*
    Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

    either24([1, 2, 2]) → true
    either24([4, 4, 1]) → true
    either24([4, 4, 1, 2, 2]) → false
     */
    public static void main(String[] args) {
        int[] nums = {4, 4, 1, 2, 2};
        boolean result = either24(nums);
        System.out.println(result);
    }

    public static boolean either24(int[] nums) {
        int countTwo = 0, countFour = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] == 2 && nums[i] == 2 ){
                countTwo++;
            } else if(nums[i-1] == 4 && nums[i] == 4 ){
                countFour++;
            }
        }
        if((countTwo+countFour) >=2 || (countTwo+countFour) == 0){
            return false;
        } else {
            return true;
        }
    }
}
