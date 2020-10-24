package CodingBat_Exercises;

public class Only14 {
    /*
    Given an array of ints, return true if every element is a 1 or a 4.

    only14([1, 4, 1, 4]) → true
    only14([1, 4, 2, 4]) → false
    only14([1, 1]) → true
     */
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 4};
        boolean result = only14(nums);
        System.out.println(result);
    }

    public static boolean only14(int[] nums){
        for (int num:nums
             ) {
            if(num == 1) continue;
            else if(num == 4) continue;
            else return false;
        }
        return true;
    }
}
