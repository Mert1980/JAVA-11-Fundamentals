package CodingBat_Exercises;

public class Sum28 {
    /*
    Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
     */
    public static void main(String[] args) {
        int[] test1 = {0, 2, 4};
        boolean value = sum28(test1);
        System.out.println(value);
    }
    public static boolean sum28(int[] nums) {
        int counter = 0;
        for (int number:nums
             ) {
            if(number == 2){
                counter++;
            }
        }
        if(counter == 4){
            return true;
        } else return false;
    }
}
