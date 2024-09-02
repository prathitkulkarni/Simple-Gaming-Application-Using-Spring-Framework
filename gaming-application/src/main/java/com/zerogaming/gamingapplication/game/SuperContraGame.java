package com.zerogaming.gamingapplication.game;

public class SuperContraGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Sit down");
    }

    @Override
    public void left() {
        System.out.println("Move back");
    }

    @Override
    public void right() {
        System.out.println("Shoot bullets");
    }
}
