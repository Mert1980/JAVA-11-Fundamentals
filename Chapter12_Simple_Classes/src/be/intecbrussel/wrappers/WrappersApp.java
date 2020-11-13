package be.intecbrussel.wrappers;

import java.util.Scanner;

public class WrappersApp {
    public static void main(String[] args) {
        /*Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String input = keyboard.next(); // 127

        Integer value = Integer.valueOf(input);
        System.out.println(value); // 127

        int intPrimitive = value.intValue();
        System.out.println(intPrimitive); // 127

        System.out.println(Integer.bitCount(value)); // 7
        System.out.println(value.byteValue()); // 127*/

        // For numbers and booleans that fits in 8 bits,
        // JVM reserves a fix location in the memory
        Integer value1 = Integer.valueOf(127);
        Integer value2 = Integer.valueOf(127);
        System.out.println(value1 == value2); // true
        System.out.println(value1.equals(value2)); // true

        Integer value3 = Integer.valueOf(128);
        Integer value4 = Integer.valueOf(128);
        System.out.println(value3 == value4); // false
        System.out.println(value3.equals(value4)); // true

    }
}
