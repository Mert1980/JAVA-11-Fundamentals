package extraExercises;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 3, 7, 1, 5, 10, 2};
        int[] arr2 = {1, 2, 3, 4, 9, 10};

        int[] duplicates = findDuplicates2(arr1, arr2);
        for (int number:duplicates) {
            System.out.println(number + " ");
        }
    }

    public static int[] findDuplicates(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length < arr2.length ? arr1.length : arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    arr[index] = arr1[i];
                    index++;
                }
            }
        }
        int[] duplicates = new int [index];
        for (int i = 0; i < index; i++) {
            duplicates[i] = arr[i];
        }
        return duplicates;
    }

    public static int[] findDuplicates2(int[] list, int[] numbers) {
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (list[i] == numbers[j]) {
                    counter++;
                }
            }
        }
        int[] dublicate = new int[counter];
        int k=0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (list[i] == numbers[j]) {
                    dublicate[k] = list[i];
                    k++;
                }
            }
        }
        return dublicate;
    }

}


