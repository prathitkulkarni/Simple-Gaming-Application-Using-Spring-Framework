package com.zerogaming.gamingapplication.game;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Get into the hole");
    }

    @Override
    public void left() {
        System.out.println("Move backwards");
    }

    @Override
    public void right() {
        System.out.println("Accelerate forward");
    }
}
