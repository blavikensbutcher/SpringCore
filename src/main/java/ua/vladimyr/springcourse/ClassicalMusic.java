package ua.vladimyr.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        Random random = new Random();
        List<String> classicalList = new ArrayList<>();
        classicalList.add("Bakh");
        classicalList.add("Mozart");
        classicalList.add("Very classy artist");

        return classicalList.get(random.nextInt(3));
    }


}

