package be.intecbrussel.exercise_02Nov2020;


import java.util.Arrays;

public class Color {
    private String name;
    private int[] rgb;

    public Color(String color){
        this.name = color;
        this.rgb = chooseColor(color);
    }

    //getters
    public String getName() {
        return name;
    }

    public int[] getRgb() {
        return rgb;
    }

    public int[] chooseColor(String color){
        int[] rgb = new int[3];
        Object[] colors = {"Black", 0, 0, 0, "White", 255, 255, 255, "Red", 255, 0, 0, "Lime", 0, 255, 0, "Blue", 0, 0, 255,
                          "Yellow", 255, 255, 0, "Aqua", 0, 255, 255, "Magenta", 255, 0, 255, "Silver", 192, 192, 192,
                            "Gray", 128, 128, 128, "Maroon", 128, 0, 0, "Olive", 128, 128, 0, "Green", 0, 128, 0,
                            "Purple", 128, 0, 128, "Teal", 0, 128, 128, "Navy", 0, 128, 128};

        for (int i = 0; i < colors.length; i+=4) {
            if(colors[i].equals(color)){
                rgb[0] = (Integer) colors[i+1];
                rgb[1] = (Integer) colors[i+2];
                rgb[2] = (Integer) colors[i+3];
            }
        }
        return rgb;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", rgb=" + Arrays.toString(rgb) +
                '}';
    }
}
