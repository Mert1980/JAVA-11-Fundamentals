package be.intecbrussel.codingBat_exercises;

public class Has77 {
    /*
    Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's
    separated by one element, such as with {7, 1, 7}.

    has77([1, 7, 7]) → true
    has77([1, 7, 1, 7]) → true
    has77([1, 7, 1, 1, 7]) → false
    */

    public static void main(String[] args) {
        int[] nums = {7, 2, 7, 2, 2, 7};
        boolean result = has77(nums);
        System.out.println(result);
    }

    public static boolean has77(int[] nums) {
        boolean control = false;
        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] == 7 && nums[i] == 7) return true;
            if(nums[i-1] == 7){
              control = true;
            }
            if(control && nums[i] != 7 ){
                counter++;
            }
            if(control && counter == 1 && nums[i] == 7) return true;
            if(counter >= 2){
                control = false;
            }

        }
        return control;
    }
}
