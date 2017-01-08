/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discord;

import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.events.*;
import net.dv8tion.jda.core.hooks.EventListener;

/**
 *
 * @author N3rdsWithGame
 */
public class EventTester implements EventListener{

    @Override
    public void onEvent(Event event) {
        if(event instanceof ReadyEvent)
            System.out.println("ready");
        else if (event instanceof DisconnectEvent)
            System.out.println("disconnected");
        else if (event instanceof ShutdownEvent)
            System.out.println("Shutdown Event");
    }
    
}
