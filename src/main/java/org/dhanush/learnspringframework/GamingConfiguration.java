package org.dhanush.learnspringframework;

import org.dhanush.learnspringframework.game.GameRunner;
import org.dhanush.learnspringframework.game.GamingConsole;
import org.dhanush.learnspringframework.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean(name = "pacManGame")
    public GamingConsole game(){
        var pacManGame = new PacManGame();
        return pacManGame;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
