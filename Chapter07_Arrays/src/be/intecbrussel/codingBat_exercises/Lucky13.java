package be.intecbrussel.codingBat_exercises;

public class Lucky13 {
    /*
 Given an array of ints, return true if the array contains no 1's and no 3's.

 lucky13([0, 2, 4]) → true
 lucky13([1, 2, 3]) → false
 lucky13([1, 2, 4]) → false
     */
    public static void main(String[] args) {
        int[] test1 = {0, 2, 4};
        boolean value = lucky13(test1);
        System.out.println(value);
    }

    public static boolean lucky13(int[] nums) {
        for (int number:nums
             ) {
            if(number == 1 || number == 3) return false;
        }
        return true;
    }
}
