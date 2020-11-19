package be.intecbrussel.exercise01_nested_classes;

public class Spotify {
    public static void main(String[] args) {
        Musician musician = new Musician();
        musician.play();

        Musician.Instrument violin = musician.new Instrument();
        violin.makeSound();
    }
}
