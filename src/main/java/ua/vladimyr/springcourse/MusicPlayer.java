package ua.vladimyr.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    private RapMusic rapMusic;
    @Value("${musicPlayer.name}")
    private String name;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    public String playMusic(Choose musicGenre) {
        if (musicGenre == Choose.ROCK){
            return "Now playin: " + rockMusic.getSong();
        } else if (musicGenre == Choose.RAP) {
            return "Now playin: " + rapMusic.getSong();

        } else return "Now playin: " + classicalMusic.getSong();
    }
}
