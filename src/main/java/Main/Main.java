/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import net.dv8tion.jda.core.JDA;
import Discord.DiscordReaderWriter;
import Discord.EventTester;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

/**
 *
 * @author N3rdsWithGame
 */
public class Main {
   public static void main(String[] args){ try {
       // entry point
       System.out.println("I am Bender, please insert girder");
       JDABuilder jdaBuilder = new JDABuilder(AccountType.BOT)
               .setToken("TOKEN");
       jdaBuilder.addListener(new DiscordReaderWriter());
       jdaBuilder.addListener(new EventTester());
       JDA jda = jdaBuilder.buildBlocking();
       
       
       
       System.out.println(jda.getStatus());
       //Trying to get Maven to work with github
       } catch (Exception ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
