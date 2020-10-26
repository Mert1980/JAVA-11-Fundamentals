package Test_Arrays_Mert_Demirok;

public class ArrayApp {
    public static void main(String[] args) {
       IntArrayTools tool = new IntArrayTools();
       // exercise 1
        int[] arr = {10, 9, 8, 7};
        System.out.println(tool.isSorted(arr, "decreasing"));

        // exercise 2
        int[] arr2 = {1, 5, 56, 2, 3, 34, 65};
        int[] sortedArr2 = tool.sort(arr2, "decreasing");
        for (int number:sortedArr2
             ) {
            System.out.print(number + " ");
        }

        System.out.println();
        // exercise 3
        int[] arr3 = {1, 5, 56, 2, 3, 34, 65};
        System.out.println(tool.chopSearch(arr3, 33));

        // exercise 4
        CharArrayTools charTool = new CharArrayTools();
        char[] arr4 = {'a', 'b', '(', '/', 'r', '+'};
        char[] filteredArr = charTool.filterAlphabet(arr4);
        for (char letter:filteredArr
             ) {
            System.out.print(letter + " ");
        }

        // exercise 5
        System.out.println();
        char[] arr5 = {'z', 'p', 'A', 'd', 'h', 'S'};
        char[] sortedArray = charTool.sort(arr5);
        for (char letter:sortedArray
        ) {
            System.out.print(letter + " ");
        }

        System.out.println();

        // exercise 6
        char[][] dictionary = charTool.generateDictionary(3);
        for (char[] col:dictionary
             ) {
            for (char letter:col
                 ) {
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }
}
