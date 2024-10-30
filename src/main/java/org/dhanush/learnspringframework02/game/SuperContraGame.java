package org.dhanush.learnspringframework02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {

    public void up(){
        System.out.println("UP");
    }

    public void down(){
        System.out.println("SIT DOWN");
    }

    public void left(){
        System.out.println("GO BACK");
    }

    public void right(){
        System.out.println("SHOOT A BULLET");
    }

}
