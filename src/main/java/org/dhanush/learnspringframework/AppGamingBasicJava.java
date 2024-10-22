package org.dhanush.learnspringframework;

import org.dhanush.learnspringframework.game.GameRunner;
import org.dhanush.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
