package org.dhanush.learnspringframework;

import org.dhanush.learnspringframework.game.GameRunner;
import org.dhanush.learnspringframework.game.MarioGame;
import org.dhanush.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var game = new MarioGame();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
