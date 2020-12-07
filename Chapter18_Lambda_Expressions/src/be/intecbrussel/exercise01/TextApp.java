package be.intecbrussel.exercise01;

public class TextApp {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello to lambda expressions");
        System.out.println("Words with letter 'e");
        tp.filteredText(s -> s.contains("e"));

        System.out.println("Words longer than 4");
        tp.filteredText(s -> s.length() > 4);

        System.out.println("Words beginning with 'a");
        tp.filteredText(s -> s.charAt(0) == 'a');

        System.out.println("Words that have 'e' as a second character");
        tp.filteredText((s -> s.charAt(1) == 'e'));

        System.out.println("Words that have 'e' 2 times");
        tp.filteredText(s -> {
            int count = 0;
            for (char ch:s.toCharArray()) {
                if(ch == 'e'){
                    count++;
                }
            }
            return count == 2;
        });
    }
}
