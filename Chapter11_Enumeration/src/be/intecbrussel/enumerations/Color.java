package be.intecbrussel.enumerations;

public enum Color {
    BLACK(0x00_00_00){
        @Override
        public String toString() {
            return "Black";
        }
    },
    WHITE(0xFF_FF_FF),
    RED(0xFF_00_00),
    GREEN(0x00_FF_00),
    BLUE(0x00_00_FF),
    YELLOW(0xFF_FF_00);

    private int rgb;

    private Color(int rgb){
        this.rgb = rgb;
    }

    public int getRgb() {
        return rgb;
    }

    @Override
    public String toString() {
        return name() + "(" + rgb + ")";
    }
}


