/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discord;

import net.dv8tion.jda.client.entities.Group;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.PermissionException;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.hooks.EventListener;

import javax.security.auth.login.LoginException;
import java.util.List;
import java.util.Random;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author N3rdsWithGame
 */
public class DiscordReaderWriter extends ListenerAdapter{
    
    public DiscordReaderWriter(){
        System.out.println("discord reader/writer made");
    }
    
    @Override    
    public void onMessageReceived(MessageReceivedEvent event){
        System.out.println("recieced message!!");
        JDA jda = event.getJDA();
        
        User author = event.getAuthor();
        Message message = event.getMessage();
        MessageChannel chnl = event.getChannel();
        
        String msg = message.getContent();
        String response = "";
        if(msg.equals("!ping")){
            response = "pong";
        }
        
        if(!response.equals("")){
            chnl.sendTyping();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException ex) {
            }
            chnl.sendMessage(response).queue();
            System.out.println("sent");
        }
    }
}
