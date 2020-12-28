package be.intecbrussel.exercise03_anoniem_class;

public class MusicianReal implements Instrument{
    @Override
    public void makeSound(String musicTool) {
        System.out.println(musicTool + " plays");
    }
}
