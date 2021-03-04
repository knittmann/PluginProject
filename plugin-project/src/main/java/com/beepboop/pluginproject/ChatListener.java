package com.beepboop.pluginproject;

import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ChatListener implements Listener{
    
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();
        String playerMessage = event.getMessage().toLowerCase();

        Bukkit.broadcastMessage(player + " sent the message " + playerMessage);



        // if(playerMessage == "jun") {
        //     Bukkit.broadcastMessage("This bruh");
        // }
    }
}
