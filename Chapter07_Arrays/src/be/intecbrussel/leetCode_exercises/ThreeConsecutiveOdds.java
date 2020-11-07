package be.intecbrussel.leetCode_exercises;

public class ThreeConsecutiveOdds {
    /*
    Given an integer array arr, return true if there are three consecutive odd numbers in the array.
    Otherwise, return false.

    Input: arr = [2,6,4,1]
    Output: false
    Explanation: There are no three consecutive odds.

    Input: arr = [1,2,34,3,4,5,7,23,12]
    Output: true
    Explanation: [5,7,23] are three consecutive odds.
     */
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        boolean result = threeConsecutiveOdds(arr);
        System.out.println(result);
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int oddCounter = 0;
        for (int number:arr
             ) {
            if(number % 2 != 0){
                oddCounter++;
            } else {
                oddCounter = 0;
            }
            if(oddCounter == 3){
                return true;
            }
        }
        return false;
    }
}
