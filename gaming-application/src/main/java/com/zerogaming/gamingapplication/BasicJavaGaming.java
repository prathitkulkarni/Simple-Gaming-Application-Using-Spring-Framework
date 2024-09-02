package com.zerogaming.gamingapplication;

import com.zerogaming.gamingapplication.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasicJavaGaming {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GameRunner.class).runGame();
    }
}
