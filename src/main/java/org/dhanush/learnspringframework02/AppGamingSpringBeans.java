package org.dhanush.learnspringframework02;

import org.dhanush.learnspringframework02.game.GameRunner;
import org.dhanush.learnspringframework02.game.GamingConsole;
import org.dhanush.learnspringframework02.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGamingSpringBeans {

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

    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(AppGamingSpringBeans.class);

        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();

    }
}
