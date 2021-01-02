package codewars_exercises;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word
within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case,
also often referred to as Pascal case).

toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
 */
public class CamelCase {
    public static void main(String[] args) {
        String text = toCamelCase("The_stealth_Warrior");
        System.out.println(text);
    }

    public static String toCamelCase(String s){
        String[] words= s.split("[_-]+");

        return Arrays.stream(words, 1, words.length)
                    .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                    .reduce(words[0], String::concat);
    }

    static String toCamelCase2(String s){
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }
}
