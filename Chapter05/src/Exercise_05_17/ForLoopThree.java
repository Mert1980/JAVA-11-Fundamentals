package Exercise_05_17;

public class ForLoopThree {
    public static void main(String[] args) {
        for (int i = 11; i < 100_000 ; i++) {
            System.out.println(i);
            i *= 11;
        }
    }
}
