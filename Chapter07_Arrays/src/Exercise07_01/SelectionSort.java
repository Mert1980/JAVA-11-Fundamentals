package Exercise07_01;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] listToBeSorted = { 0, -25, 6, 22, -64, 55, 23, 99, -1, 3 };
        int[] newArray = listToBeSorted;

        int index = 1;
        while(newArray.length > 1){
            newArray = sort(newArray, 0);
            int min = min(newArray);
            listToBeSorted[index] = min;
            index+=1;
        }
        for (int number:listToBeSorted
             ) {
            System.out.print(number + " ");
        }
    }

    public static int[] sort(int[] list, int index){
        int min = min(list);
        int swapIndex = findSwapMinIndex(list, min);
        list[swapIndex] = list[index];
        list[index] = min;

        int[] newArray = Arrays.copyOfRange(list, index + 1, list.length );
        return newArray;
    }

    public static int min(int... values){
        int min = values[0];
        for (int i = 0; i < values.length -1; i++) {
            if(min > values[i + 1 ]){
                min = values[i+ 1];
            }
        }
        return min;
    }

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
