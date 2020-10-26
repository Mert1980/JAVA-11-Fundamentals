package CodingBat_Exercises;

public class TwoTwo {
    /*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2.

    twoTwo([4, 2, 2, 3]) → true
    twoTwo([2, 2, 4]) → true
    twoTwo([2, 2, 4, 2]) → false
     */
    public static void main(String[] args) {
        int[] test1 = {2};
        boolean hasTwo = twoTwo(test1);
        System.out.println(hasTwo);
    }

    public static boolean twoTwo(int[] nums) {
        boolean check = false;
        int counter = 0;
        if(nums.length == 0) return true;
        if(nums[0] == 2 && nums.length == 1){
            return false;
        } else if(nums.length == 0) return true;
        for (int i = 1; i < nums.length; i++) {

            if(nums[i] == 2){
                counter++;
            }
            if(nums[i-1] == 2 && nums[i] == 2){
                check = true;
            } else if(nums[i-1] != 2 && nums[i] == 2){
                check = false;
            }
        }
        if(counter == 0){
            return true;
        } else return check;
    }
}
