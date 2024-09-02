package com.zerogaming.gamingapplication.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole getGame(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner getGameRunner(GamingConsole getGame){
        var gameRunner = new GameRunner(getGame);
        return gameRunner;
    }

}
