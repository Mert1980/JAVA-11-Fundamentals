package be.intecbrussel.test_arrays_mert_demirok;

public class IntArrayTools {

    public boolean chopSearch(int[] numbers, int value){
        int[] sortedNumbers = sort(numbers, "increasing");
        int l = sortedNumbers.length/2;
        for (int i = sortedNumbers[l] < value ? l : 0; i < sortedNumbers.length; i++) {
            if(sortedNumbers[i] == value){
                return true;
            }
        }
        return false;
    }

    public boolean isSorted(int [] arr, String direction){
        switch (direction){
            case "increasing":
                for (int i = 1; i < arr.length ; i++) {
                    if(arr[i-1] < arr[i]){
                        continue;
                    } else return false;
                }
                break;
            case "decreasing":
                for (int i = 1; i < arr.length ; i++) {
                    if(arr[i-1] > arr[i]){
                        continue;
                    } else return false;
                }
        }
        return true;
    }

    public int[] sort(int [] numbers, String direction){
        switch (direction){
            case "increasing":
                return sort(numbers, 1);
            case "decreasing":
                return sort(numbers, -1);
        }
        return numbers;
    }

    public int[] sort(int [] numbers, int directionIndex){
        int[] temp = {0};
        int counter = numbers.length;
        do{
            for (int i = 1; i < numbers.length; i++) {
                if(directionIndex == 1){
                    if (numbers[i-1] >= numbers[i]){
                        temp[0] = numbers[i-1];
                        numbers[i-1] = numbers[i];
                        numbers[i] = temp[0];
                    }
                } else if (directionIndex == -1){
                    if (numbers[i-1] <= numbers[i]){
                        temp[0] = numbers[i-1];
                        numbers[i-1] = numbers[i];
                        numbers[i] = temp[0];
                    }
                }

            }
            counter--;
        } while(counter > 0);
       return numbers;
    }
}
