package be.intecbrussel.enumerations;

import static be.intecbrussel.enumerations.Color.RED;

public class ColorApp {
    public static void main(String[] args) {
        Color color1 = Color.RED;
        Color color2 = Color.GREEN;

        printColor(color1); // RED 2 Red
        printColor(color2); // GREEN 3 Green

        Color color3 = RED;
        System.out.println(color3); // RED

        System.out.println(color1); // RED
        System.out.println(Color.valueOf("RED")); // RED
        System.out.println(color2); // GREEN

        for (Color c:Color.values() // returns array of COLORs
             ) {
            System.out.println(c); // BLACK, WHITE, RED, GREEN, BLUE, YELLOW
        }

        Color color = Color.valueOf("BLACK");
        System.out.println(color); // BLACK

    }

    public static void printColor(Color color){
        System.out.println(color.name());
        System.out.println(color.ordinal());
        String text = null;
        switch (color){
            case BLACK: text = "Black"; break;
            case WHITE: text = "White"; break;
            case RED: text = "Red"; break;
            case GREEN: text = "Green"; break;
            case BLUE: text = "Blue"; break;
            case YELLOW: text = "Yellow"; break;
        }
        System.out.println(text);
    }
}
