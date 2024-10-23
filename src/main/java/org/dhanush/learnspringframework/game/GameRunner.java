package org.dhanush.learnspringframework.game;

public class GameRunner {

    //private MarioGame game;
    private SuperContraGame game;

//    public GameRunner(MarioGame game) {
//        this.game = GameRunner.this.game;
//    }

    public GameRunner(SuperContraGame game){
        this.game = game;
    }

    public void run() {
        System.out.println("Game Running: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
