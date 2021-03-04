package com.beepboop.pluginproject;

import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;

public class ChatListener implements Listener{
    
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        String playerMessage = event.getMessage().toLowerCase();

        if(playerMessage == "jun") {
            Bukkit.broadcastMessage("This bruh");
        }
    }
}
