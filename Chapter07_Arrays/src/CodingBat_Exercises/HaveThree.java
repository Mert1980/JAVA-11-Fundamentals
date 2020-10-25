package CodingBat_Exercises;

public class HaveThree {
    /*
    Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

    haveThree([3, 1, 3, 1, 3]) → true
    haveThree([3, 1, 3, 3]) → false
    haveThree([3, 4, 3, 3, 4]) → false
     */
    public static void main(String[] args) {
        int[] test1 = {3, 4, 3, 3, 4};
        boolean hasTwo = haveThree(test1);
        System.out.println(hasTwo);
    }
    public static boolean haveThree(int[] nums) {
        int counter = 0;
        boolean check= true;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 3) counter++;
        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] == 3 && nums[i] == 3) check = false;
        }
        if(counter == 3 && check) return true;
        else return false;
    }

}
