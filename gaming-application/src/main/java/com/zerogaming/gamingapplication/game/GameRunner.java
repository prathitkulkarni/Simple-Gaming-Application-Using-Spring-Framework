package com.zerogaming.gamingapplication.game;

public class GameRunner {

    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void runGame(){
        System.out.println("Running Game : " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
