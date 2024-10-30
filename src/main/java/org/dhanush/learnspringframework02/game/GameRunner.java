package org.dhanush.learnspringframework02.game;

/*
    Tightly coupled:
        I had to create a new variable
        I had to create a constructor for the game
        cannot have both the games with the same variable, if I had to run
        superContraGame then I have to comment out the MarioGame otherwise
        there will be an error in variables.
        If you give diff variable names for each game, then run() method has
        to change, according to the game, every time.
 */

public class GameRunner {

    private GamingConsole game;

    public GameRunner(GamingConsole game){
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
