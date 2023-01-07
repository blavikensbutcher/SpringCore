package ua.vladimyr.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        Random random = new Random();
        List<String> rapList = new ArrayList<>();
        rapList.add("Xzibit");
        rapList.add("Eminem");
        rapList.add("50Cent");
        return rapList.get(random.nextInt(3));
    }
}
