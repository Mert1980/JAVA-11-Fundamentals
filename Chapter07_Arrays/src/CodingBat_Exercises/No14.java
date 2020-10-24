package CodingBat_Exercises;

public class No14 {
    /*
    Given an array of ints, return true if it contains no 1's or it contains no 4's.

    no14([1, 2, 3]) → true
    no14([1, 2, 3, 4]) → false
    no14([2, 3, 4]) → true
     */
    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        boolean result = only14(nums);
        System.out.println(result);
    }

    public static boolean only14(int[] nums){
        int counterOne = 0, counterTwo = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                counterOne++;
            } else if(nums[i] == 4){
                counterTwo++;
            }
        }
        if(counterOne >= 1 && counterTwo >=1) return false;
        else return true;
    }
}
