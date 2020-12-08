package be.intecbrussel.exercise02;

public interface TextUtil {
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        return sb.append(s).reverse().toString();
    }
}
