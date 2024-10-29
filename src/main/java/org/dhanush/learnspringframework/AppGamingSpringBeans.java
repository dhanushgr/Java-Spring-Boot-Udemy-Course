package org.dhanush.learnspringframework;

import org.dhanush.learnspringframework.game.GameRunner;
import org.dhanush.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBeans {
    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();

    }
}
