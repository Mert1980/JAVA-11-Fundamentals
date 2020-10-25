package CodingBat_Exercises;

public class Has12 {
    /*
    Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

    has12([1, 3, 2]) → true
    has12([3, 1, 2]) → true
    has12([3, 1, 4, 5, 2]) → true
     */
    public static void main(String[] args) {
        int[] test1 = {2, 1, 4, 1, 2};
        boolean hasTwo = has12(test1);
        System.out.println(hasTwo);
    }

    public static boolean has12(int[] nums) {
        boolean check = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                check = true;
            }
            if(check && nums[i] == 2){
                return true;
            }
        }
        return false;
    }
}
