package org.dhanush.learnspringframework02.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/*
    @Primary annotation makes sure that this file runs when there are more
    than one @component assigned to different files
 */
@Component
@Primary
public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("JUMP");
    }

    public void down(){
        System.out.println("GO INTO THE HOLE");
    }

    public void left(){
        System.out.println("MOVE BACKWARD");
    }

    public void right(){
        System.out.println("MOVE FORWARD");
    }

}
