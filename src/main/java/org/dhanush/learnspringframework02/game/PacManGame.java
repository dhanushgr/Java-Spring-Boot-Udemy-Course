package org.dhanush.learnspringframework02.game;

public class PacManGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("MOVE UP");
    }

    @Override
    public void down() {
        System.out.println("MOVE DOWN");
    }

    @Override
    public void left() {
        System.out.println("MOVE LEFT");
    }

    @Override
    public void right() {
        System.out.println("MOVE RIGHT");
    }

    @Override
    public String toString() {
        return "PacManGame{}";
    }

}
