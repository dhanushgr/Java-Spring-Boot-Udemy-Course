package org.dhanush.learnspringframework.game;

public class GameRunner {

    MarioGame game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Game Running: " + game);
    }
}
