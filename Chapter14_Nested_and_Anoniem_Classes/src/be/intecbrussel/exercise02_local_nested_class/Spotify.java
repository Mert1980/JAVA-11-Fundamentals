package be.intecbrussel.exercise02_local_nested_class;

public class Spotify {
    public static void main(String[] args) {
        Musician musician = new Musician();
        musician.play();
        // Violin makes sound!
        // 0
        // 3

        System.out.println(musician.play());
        // Violin makes sound!
        // 0
        // 3
        // instrument number 3
    }
}
