package Exercise07_03;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [] [] table = new int[4][6];

        System.out.println(table.length);

        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[i].length; j++) {
                table[i][j] = i * j;
            }
        }

        for (int[] row:table){
            for (int column : row){
                System.out.print(" " + column + " ");
            }
            System.out.println();
        }
    }
}
