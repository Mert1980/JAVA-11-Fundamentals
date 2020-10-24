package CodingBat_Exercises;

public class More14 {
    /*
    Given an array of ints, return true if the number of 1's is greater than the number of 4's

    more14([1, 4, 1]) → true
    more14([1, 4, 1, 4]) → false
    more14([1, 1]) → true
     */
    public static void main(String[] args) {
        int[] test1 = {1, 4, 1, 4};
        boolean value = more14(test1);
        System.out.println(value);
    }
    public static boolean more14(int[] nums) {
        int countOne = 0, countFour = 0;
        for (int number:nums
        ) {
            if(number == 1){
                countOne++;
            } else if(number == 4){
                countFour++;
            }
        }
        if(countOne > countFour){
            return true;
        } else return false;
    }
}
