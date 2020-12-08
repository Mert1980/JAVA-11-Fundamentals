package be.intecbrussel.exercise02;

public interface TextUtil {
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
