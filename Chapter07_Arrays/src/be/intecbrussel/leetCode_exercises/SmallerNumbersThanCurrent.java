package be.intecbrussel.leetCode_exercises;

public class SmallerNumbersThanCurrent {
    /*
    Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is,
    for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

    Input: nums = [6,5,4,8]
    Output: [2,1,0,3]
     */
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        int[] result = smallerNumbersThanCurrent(nums);
        for (int num:result
             ) {
            System.out.print(num + " ");
        }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    counter++;
                }
            }
           result[i] = counter;
        }
        return result;
    }
}
