package ua.vladimyr.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RockMusic implements Music{
    @Override
    public String getSong() {
        Random random = new Random();
        List<String> rockList = new ArrayList<>();
        rockList.add("Ozzy");
        rockList.add("AC/DC");
        rockList.add("Very rare artist: Deep Purple");
        return rockList.get(random.nextInt(3));
    }
}
