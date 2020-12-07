package be.intecbrussel.exercise01;

public class TextApp {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello World");
        System.out.println("Words with letter 'e");
        tp.filteredText(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                return s.contains("e");
            }
        });
    }
}
