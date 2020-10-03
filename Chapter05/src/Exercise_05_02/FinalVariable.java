package Exercise_05_02;

public class FinalVariable {
    public static void main(String[] args){
        final float PI = (float) 3.14;

        PI = 3.15F; // Error: java cannot assign a value to final variable PI

    }
}
