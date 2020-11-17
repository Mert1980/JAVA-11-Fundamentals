package be.intecbrussel.mediaplayer;

public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        this.advancedMusicPlayer = audioType.toLowerCase().contains("mp4") ? new Mp4Player() :
                                   audioType.toLowerCase().contains("vlc") ? new VlcPlayer() : null;

    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        } else if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp3")){
                System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " is not supported");
        }
    }
}
