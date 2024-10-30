package org.dhanush.learnspringframework02;

import org.dhanush.learnspringframework02.game.GameRunner;
import org.dhanush.learnspringframework02.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
    @ComponentScan should be added in this file with a package name where it
    should look for the game. the package name should be where you have
    mentioned @Component file
 */
@Configuration
@ComponentScan("org.dhanush.learnspringframework02.game")
public class AppGamingSpringBeans {

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
