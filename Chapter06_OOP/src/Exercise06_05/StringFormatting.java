package Exercise06_05;

import java.util.Formatter;

public class StringFormatting {
    public static void main(String[] args) {
        convertToFeet(20);
    }

    public static void convertToFeet(float number) {
        Formatter formatter = new Formatter();

        final float conversionRateToFeet = 3.28f;
        for (float i = 1; i < number; i += 0.5) {
            float j = conversionRateToFeet * i;
            formatter.format("%.2f %s %s %.2f %s %n", i, " meter", "=", j, " feet");
        }
        System.out.println(formatter.toString());
    }
}
