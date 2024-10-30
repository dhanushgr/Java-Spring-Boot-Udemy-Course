package org.dhanush.learnspringframework02.game;

import org.springframework.stereotype.Component;

/*
    Adding @Component tells Spring that, this is a component and it should
    manage it and it creates a @Bean for us, instead of us creating it ourselves
 */
@Component
public class PacManGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("MOVE UP");
    }

    @Override
    public void down() {
        System.out.println("MOVE DOWN");
    }

    @Override
    public void left() {
        System.out.println("MOVE LEFT");
    }

    @Override
    public void right() {
        System.out.println("MOVE RIGHT");
    }

    @Override
    public String toString() {
        return "PacManGame{}";
    }

}
