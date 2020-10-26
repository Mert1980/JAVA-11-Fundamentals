package Test_Arrays_Mert_Demirok;

public class ArrayApp {
    public static void main(String[] args) {
       /* IntArrayTools tool = new IntArrayTools();
        int[] arr = {10, 60, 400, 2000};
        System.out.println(tool.isSorted(arr, "increasing"));

        int[] arr2 = {1, 5, 56, 2, 3, 34, 65};
        int[] sortedArr2 = tool.sort(arr2, "decreasing");
        for (int number:sortedArr2
             ) {
            System.out.print(number + " ");
        }

        System.out.println();

        int[] arr3 = {1, 5, 56, 2, 3, 34, 65};
        System.out.println(tool.chopSearch(arr3, 33));*/

        CharArrayTools charTool = new CharArrayTools();
        char[] arr4 = {'a', 'b', '(', '/', 'r', '+'};
        char[] filteredArr = charTool.filterAlphabet(arr4);
        for (char letter:filteredArr
             ) {
            System.out.print(letter + " ");
        }

        System.out.println();
        char[] arr5 = {'z', 'p', 'A', 'd', 'h', 'S'};
        char[] sortedArray = charTool.sort(arr5);
        for (char letter:sortedArray
        ) {
            System.out.print(letter + " ");
        }
    }
}
