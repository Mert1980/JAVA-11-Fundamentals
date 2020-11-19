package be.intecbrussel.exercise03_anoniem_class;

public class Musician {
    public void play(String musicTool){
        Instrument instrument = new Instrument() {
            @Override
            public void makeSound(String musicTool) {
                System.out.println(musicTool + " plays");
            }
        };
        instrument.makeSound(musicTool);
    }
}
