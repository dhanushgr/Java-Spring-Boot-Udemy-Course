package org.dhanush.learnspringframework02.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
    @ComponentScan should be added in this file with a package name where it
    should look for the game. the package name should be where you have
    mentioned @Component file
 */
@Configuration
@ComponentScan("org.dhanush.learnspringframework02.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);

        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();

    }
}
