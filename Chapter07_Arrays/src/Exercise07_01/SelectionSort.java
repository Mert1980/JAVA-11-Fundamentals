package Exercise07_01;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] listToBeSorted = { 0, -25, 6, 22, -64, 55, 23, 99, -1, 3 };
        int[] newArray = listToBeSorted; // make a new array to be used as a right sub-array

        int index = 1;
        while(newArray.length > 1){
            newArray = sort(newArray, 0); // update the right sub-array by removing the min values
            int min = min(newArray); // find the min value in the right sub-array
            listToBeSorted[index] = min; // assign the found min value in the correct index number left to right
            index+=1;
        }
        for (int number:listToBeSorted
             ) {
            System.out.print(number + " ");
        }
    }
    // assign the min value in listToBeSorted in far most left index
    // return the new right sub-array
    // right sub-array will be shortened in every call of sort method by removing the min value in it
    public static int[] sort(int[] list, int index){
        int min = min(list);
        int swapIndex = findSwapMinIndex(list, min);
        list[swapIndex] = list[index];
        list[index] = min;
    // make a new array excluding the indexes of previously found min numbers
        int[] newArray = Arrays.copyOfRange(list, index + 1, list.length );
        return newArray;
    }
    // find the min number in an array
    public static int min(int... values){
        int min = values[0];
        for (int i = 0; i < values.length -1; i++) {
            if(min > values[i + 1 ]){
                min = values[i+ 1];
            }
        }
        return min;
    }
    // find the index number of the value that will be swapped with the index number of min value
    public static int findSwapMinIndex(int [] arr ,int min){
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;

        while (i < len) {
            if (arr[i] == min) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}
