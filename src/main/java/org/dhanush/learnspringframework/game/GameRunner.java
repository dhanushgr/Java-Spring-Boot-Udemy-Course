package org.dhanush.learnspringframework.game;

public class GameRunner {

    MarioGame marioGame;

    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    public void run() {
        System.out.println("Game Running: " + marioGame);
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();
    }
}
