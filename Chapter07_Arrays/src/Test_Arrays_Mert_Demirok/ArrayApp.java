package Test_Arrays_Mert_Demirok;

public class ArrayApp {
    public static void main(String[] args) {
        IntArrayTools tool = new IntArrayTools();
        int[] arr = {10, 60, 400, 2000};
        System.out.println(tool.isSorted(arr, "increasing"));

        int[] arr2 = {1, 5, 56, 2, 3, 34, 65};
        int[] sortedArr2 = tool.sort(arr2, "decreasing");
        for (int number:sortedArr2
             ) {
            System.out.print(number + " ");
        }
    }
}
